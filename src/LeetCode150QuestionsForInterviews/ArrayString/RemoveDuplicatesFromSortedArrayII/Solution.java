package LeetCode150QuestionsForInterviews.ArrayString.RemoveDuplicatesFromSortedArrayII;
/*
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place
such that each unique element appears at most twice.
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages,
you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates,
then the first k elements of nums should hold the final result.
 It does not matter what you leave beyond the first k elements.
 */
public class Solution {
        public int removeDuplicates(int[] nums){
            int nr = 2;
            for(int i = 2; i < nums.length; i++){
                if(nums[i] != nums[nr - 2]){
                    nums[nr] = nums[i];
                    nr++;
                }
            }
            return nr;
        }
}
