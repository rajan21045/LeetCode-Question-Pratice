/*
349. Intersection of Two Arrays
Level: Easy
Question: Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Link: https://leetcode.com/problems/intersection-of-two-arrays/
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

*/
import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>result = new HashSet<>();
        for(int nums: nums1){
            set1.add(nums);
        }
        for(int nums: nums2){
            if(set1.contains(nums)){
             result.add(nums);
            }
        }
        int answer[] = new int[result.size()];
        int idex =0;
        for(int num: result){
            answer[idex++] = num;
        }

        return answer;

    }
}
