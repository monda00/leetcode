import removeDuplicates from "./solution";

test("test solution", () => {
  let nums1: number[] = [1, 1, 2];
  let expectedNums1: number[] = [1, 2];

  let k1: number = removeDuplicates(nums1);

  expect(k1).toBe(expectedNums1.length);
  for (let i = 0; i < k1; i++) {
    expect(nums1[i]).toBe(expectedNums1[i]);
  }

  let nums2: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];
  let expectedNums2: number[] = [0, 1, 2, 3, 4];

  let k2: number = removeDuplicates(nums2);

  expect(k2).toBe(expectedNums2.length);
  for (let i = 0; i < k2; i++) {
    expect(nums2[i]).toBe(expectedNums2[i]);
  }
});
