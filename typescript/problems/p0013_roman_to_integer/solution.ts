function romanToInt(s: string): number {
  let result = 0;
  let prevValue = 0;

  for (let i = s.length - 1; i >= 0; i--) {
    const c = s[i];
    let value = 0;

    switch (c) {
      case "I":
        value = 1;
        break;
      case "V":
        value = 5;
        break;
      case "X":
        value = 10;
        break;
      case "L":
        value = 50;
        break;
      case "C":
        value = 100;
        break;
      case "D":
        value = 500;
        break;
      case "M":
        value = 1000;
        break;
    }

    if (value < prevValue) {
      result -= value;
    } else {
      result += value;
      prevValue = value;
    }
  }

  return result;
}

export default romanToInt;
