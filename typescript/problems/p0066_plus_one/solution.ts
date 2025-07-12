function plusOne(digits: number[]): number[] {
  for (let i = digits.length - 1; i >= 0; i--) {
    if (digits[i] < 9) {
      digits[i]++;
      return digits;
    }
    digits[i] = 0;
  }

  let ret: number[] = new Array(digits.length + 1).fill(0);
  ret[0] = 1;
  return ret;
}

export default plusOne;
