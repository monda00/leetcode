function longestCommonPrefix(strs: string[]): string {
  let prefix: string = "";

  if (strs.length === 0) {
    return prefix;
  }

  for (let i = 0; i < strs[0].length; i++) {
    const c = strs[0][i];

    const allMatch: boolean = strs.every(
      (str) => i < str.length && str[i] === c
    );

    if (!allMatch) break;

    prefix += c;
  }

  return prefix;
}

export default longestCommonPrefix;
