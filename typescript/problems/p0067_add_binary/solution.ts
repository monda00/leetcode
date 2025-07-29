function addBinary(a: string, b: string): string {
  let i: number = a.length - 1;
  let j: number = b.length - 1;
  let carry: number = 0;
  let sum_arr: number[] = [];

  while (i >= 0 || j >= 0 || carry != 0) {
    let sum: number = carry;

    if (i >= 0) {
      sum += Number(a[i]) - Number("0");
      i--;
    }

    if (j >= 0) {
      sum += Number(b[j]) - Number("0");
      j--;
    }

    sum_arr.push(sum % 2);
    carry = Math.floor(sum / 2);
  }

  return sum_arr.reverse().join("");
}

export default addBinary;
