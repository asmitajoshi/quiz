/* Suppose an array in ascending order is rotated at some pivot unknown 
  to you beforehand. You are given a target value to search. If 
  found in array, return its index, otherwise return -1. Assume no 
  duplicate exists in the array. */
/* input: [4,5,6,7,0,1,2]. element to search 0. If search for 8, return -1 */

public class SearchInRotatedArray {
public int getPivot(int[] nums, int start, int end) {
  int pivot = (start + end) / 2;
  if (nums[pivot] < nums[(pivot - 1) % nums.length]) {
    return pivot;
  } else if (nums[pivot] > nums[(pivot - 1) % nums.length]) {
    return getPivot(nums, pivot + 1, nums.length - 1);
  }
  return 0;
}
public static void main(String[] args) {
  int[] a = new int[] {4,5,6,7,0,1,2};
  SearchInRotatedArray sira = new SearchInRotatedArray();
  int pivot = sira.getPivot(a, 0, a.length);
  System.out.println("pivot: " + pivot);
}
}
