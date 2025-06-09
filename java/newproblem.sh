#!/bin/bash

if [ $# -ne 1 ]; then
  echo "Usage: $0 pXXXX_problem_name"
  exit 1
fi

PROBLEM_DIR="problems/$1"

if [ -d "$PROBLEM_DIR" ]; then
  echo "Error: Directory $PROBLEM_DIR already exists."
  exit 1
fi

mkdir -p "$PROBLEM_DIR"

PACKAGE_NAME="$1"
CLASS_NAME="Solution"
TEST_CLASS_NAME="SolutionTest"

cat <<EOF > "$PROBLEM_DIR/$CLASS_NAME.java"
package problems.$PACKAGE_NAME;

public class $CLASS_NAME {
    public int exampleMethod(int a, int b) {
        return a + b;
    }
}
EOF

cat <<EOF > "$PROBLEM_DIR/$TEST_CLASS_NAME.java"
package problems.$PACKAGE_NAME;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class $TEST_CLASS_NAME {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals(5, solution.exampleMethod(2, 3));
    }
}
EOF

echo "Created new problem at $PROBLEM_DIR"
