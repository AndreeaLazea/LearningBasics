package LeetCode150QuestionsForInterviews.ArrayString.MajorityElement;
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.




 */
public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else{
            int maj_el = 0;
            int max = 0;
            for(int i = 0; i < nums.length - 1; i++){
                int count = 1;
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count > max){
                    max = count;
                    maj_el = nums[i];

                }

        }
            return maj_el;
    }
}}
