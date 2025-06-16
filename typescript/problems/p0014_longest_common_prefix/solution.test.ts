import longestCommonPrefix from "./solution";

test("test solution", () => {
  expect(longestCommonPrefix(["flower", "flow", "flight"])).toBe("fl");
  expect(longestCommonPrefix(["dog", "racecar", "car"])).toBe("");
  expect(longestCommonPrefix(["ab", "a"])).toBe("a");
});
