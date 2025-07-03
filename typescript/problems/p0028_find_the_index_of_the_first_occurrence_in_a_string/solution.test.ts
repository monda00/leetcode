import strStr from "./solution";

test("test solution", () => {
  expect(strStr("sadbutsad", "sad")).toBe(0);
  expect(strStr("leetcode", "leeto")).toBe(-1);
});
