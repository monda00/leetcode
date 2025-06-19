function isValid(s: string): boolean {
  let stack: string[] = [];

  for (let i = 0; i < s.length; i++) {
    let current: string = s[i];

    if (current === "(" || current === "[" || current === "{") {
      stack.push(current);
    } else {
      if (stack.length === 0) return false;

      let last: string = stack[stack.length - 1];
      if (
        (current === ")" && last === "(") ||
        (current === "]" && last === "[") ||
        (current === "}" && last === "{")
      ) {
        stack.pop();
      } else {
        return false;
      }
    }
  }

  return stack.length === 0;
}

export default isValid;
