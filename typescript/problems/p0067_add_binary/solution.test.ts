import addBinary from "./solution";

test("test solution", () => {
  expect(addBinary("11", "1")).toBe("100");
  expect(addBinary("1010", "1011")).toBe("10101");
});
