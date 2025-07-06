function lengthOfLastWord(s: string): number {
  let trimmed: string = s.trim();
  let ret: number = 0;

  for (let i = trimmed.length - 1; i >= 0; i--) {
    let c: string = trimmed[i];
    if (c === " ") {
      break;
    }
    ret++;
  }
  return ret;
}

export default lengthOfLastWord;
