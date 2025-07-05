import searchInsert from "./solution";

test("test solution", () => {
  expect(searchInsert([1, 3, 5, 6], 5)).toBe(2);
  expect(searchInsert([1, 3, 5, 6], 2)).toBe(1);
  expect(searchInsert([1, 3, 5, 6], 7)).toBe(4);
});
