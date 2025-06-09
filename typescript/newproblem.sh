#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Usage: $0 pXXXX_problem_name"
  exit 1
fi

DIR="problems/$1"

if [ -d "$DIR" ]; then
  echo "Error: $DIR already exists."
  exit 1
fi

mkdir -p "$DIR"

cat <<EOF > "$DIR/solution.ts"
function example(a: number, b: number): number {
  return a + b;
}

export default example;
EOF

cat <<EOF > "$DIR/solution.test.ts"
import example from './solution';

test('test solution', () => {
  expect(example(2, 3)).toBe(5);
});
EOF

echo "Created TypeScript problem at $DIR"
