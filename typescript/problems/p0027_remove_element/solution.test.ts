import removeElement from "./solution";

test("test solution", () => {
  let nums1: number[] = [3, 2, 2, 3];
  let val1: number = 3;
  let expectedNums1: number[] = [2, 2];

  let k1: number = removeElement(nums1, val1);

  nums1 = nums1.slice(0, k1).sort((a, b) => a - b);
  expect(k1).toBe(expectedNums1.length);
  for (let i = 0; i < k1; i++) {
    expect(nums1[i]).toBe(expectedNums1[i]);
  }

  let nums2: number[] = [0, 1, 2, 2, 3, 0, 4, 2];
  let val2: number = 2;
  let expectedNums2: number[] = [0, 0, 1, 3, 4];

  let k2: number = removeElement(nums2, val2);

  nums2 = nums2.slice(0, k2).sort((a, b) => a - b);
  expect(k2).toBe(expectedNums2.length);
  for (let i = 0; i < k2; i++) {
    expect(nums2[i]).toBe(expectedNums2[i]);
  }
});
