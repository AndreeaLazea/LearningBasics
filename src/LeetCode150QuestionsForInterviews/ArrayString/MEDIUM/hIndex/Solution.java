package LeetCode150QuestionsForInterviews.ArrayString.MEDIUM.hIndex;
/*
Given an array of integers citations where citations[i] is the number of citations
a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia:
The h-index is defined as the maximum value of h such that the given researcher
 has published at least h papers that have each been cited at least h times.
 */
public class Solution {
    public int hIndex(int[] citations){
        int n = citations.length;
        int[] bucket = new int[n+1];
        for(int c : citations){
            if(c >= n){
                bucket[n]++;
            }
            else{
                bucket[c]++;
            }
        }
        int count = 0;
        for(int i = n; i >=0; i--){
            count += bucket[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}
