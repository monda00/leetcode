import isValid from "./solution";

test("test solution", () => {
  expect(isValid("()")).toBe(true);
  expect(isValid("()[]{}")).toBe(true);
  expect(isValid("(]")).toBe(false);
  expect(isValid("([])")).toBe(true);
});
