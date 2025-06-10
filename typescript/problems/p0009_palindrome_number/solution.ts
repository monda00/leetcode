function isPalindrome(x: number): boolean {
  if (x < 0) return false;

  const x_str = x.toString();

  for (let i = 0; i < x_str.length / 2; i++) {
    if (x_str[i] !== x_str[x_str.length - 1 - i]) {
      return false;
    }
  }

  return true;
}

export default isPalindrome;
