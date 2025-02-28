package LeetCode150QuestionsForInterviews.ArrayString.RemoveElement;
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The order of the elements may be changed. Then return the number of elements in nums which
// are not equal to val.
//
//Consider the number of elements in nums which are not equal to val be k, to get accepted,
// you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the elements which
// are not equal to val. The remaining elements of nums are not important as well as the size
// of nums.
//
//Return k.


//in place algorithm = it modifies the input in place, without creating a separate copy of
//                      the data structure.
// An algorithm which is not in-place is sometimes called not-in-place or out-of-place.
public class Solution {
    public int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
