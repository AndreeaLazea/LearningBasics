package LeetCode150QuestionsForInterviews.ArrayString.MEDIUM.ProductOfArrayExceptSelf;
/*
Given an integer array nums, return an array answer such that answer[i] is equal
to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int exists = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                prod = prod * nums[i];
            }
            if(nums[i] == 0){
                exists = exists + 1;
            }
        }
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(exists == 0){
                answer[i] = prod / nums[i];
            }
            else if( exists == nums.length){
                answer[i] = 0;
            }
            else if( exists == 1)
            {
                if(nums[i] == 0){
                    answer[i] = prod ;
                }
                else{
                    answer[i] = 0;
                }
            }
            else if(exists > 1){
                answer[i] = 0;
            }
        }
        return answer;
    }
}
