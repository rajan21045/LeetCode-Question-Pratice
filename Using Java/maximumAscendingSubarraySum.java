class Solution {
// Question Link: https://leetcode.com/problems/maximum-ascending-subarray-sum/
    /*
     * Problem:
     * Given an array of positive integers nums, return the maximum sum
     * of a strictly increasing (ascending) subarray.
     *
     * A subarray is a contiguous part of the array.
     * A subarray is ascending if nums[i] < nums[i+1] for all elements. :contentReference[oaicite:0]{index=0}
     *
     * Example:
     * Input: [10,20,30,5,10,50]
     * Output: 65
     * Explanation: The subarray [5,10,50] has the maximum sum.
     *
     * Approach:
     * - Traverse the array once (O(n)).
     * - Maintain:
     *      currentSum → sum of current ascending subarray
     *      maxSum → maximum sum found so far
     * - If current element > previous → extend subarray
     * - Else → start a new subarray from current element
     * - Update maxSum at each step
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];      // stores maximum sum found
        int currentSum = nums[0];  // stores current ascending subarray sum

        for(int i = 1; i < nums.length; i++){

            // check if ascending condition holds
            if(nums[i] > nums[i - 1]){
                currentSum += nums[i];  // extend current subarray
            } else {
                currentSum = nums[i];   // start new subarray
            }

            // update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
