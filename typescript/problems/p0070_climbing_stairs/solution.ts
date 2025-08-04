function climbStairs(n: number): number {
  if (n == 1) return n;

  let a: number = 1;
  let b: number = 2;

  for (let i = 3; i <= n; i++) {
    let tmp = a + b;
    a = b;
    b = tmp;
  }

  return b;
}

export default climbStairs;
