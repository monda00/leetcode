function mySqrt(x: number): number {
  if (x === 0 || x === 1) {
    return x;
  }

  let a: number = 0;
  let b: number = Math.floor(x / 2) + 1;
  let mid: number;

  while (b - a > 1) {
    mid = Math.floor((a + b) / 2);

    if (mid * mid <= x) {
      a = mid;
    } else {
      b = mid;
    }
  }

  return a;
}

export default mySqrt;
