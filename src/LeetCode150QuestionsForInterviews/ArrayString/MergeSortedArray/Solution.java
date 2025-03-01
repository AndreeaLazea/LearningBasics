package LeetCode150QuestionsForInterviews.ArrayString.MergeSortedArray;
//
//     You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in
// nums1 and nums2 respectively.
//     Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//     The final sorted array should not be returned by the function, but instead be stored inside
//the array nums1.
//     To accommodate this, nums1 has a length of m + n, where the first m elements
//denote the elements that should be merged, and the last n elements are set to 0 and should be
//ignored. nums2 has a length of n.
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k = k-1;
                i = i -1;
            }
            else{
                nums1[k] = nums2[j];
                k = k-1;
                j = j-1;
            }
        }
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
//       we don't need this because the i one is already sorted
//        and doesnt need to be copied in itself again.
//        while(i >= 0){
//            nums1[k] = nums1[i];
//            k = k - 1;
//            i = i -1;
//        }
    }
}
