// Given an array, rotate the array to the right by k steps, where k is non-negative.
//
// Follow up:
//
//
// 	Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
// 	Could you do it in-place with O(1) extra space?
//
//
//  
// Example 1:
//
//
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
//
//
// Example 2:
//
//
// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
//
//
//  
// Constraints:
//
//
// 	1 <= nums.length <= 2 * 10^4
// 	It's guaranteed that nums[i] fits in a 32 bit-signed integer.
// 	k >= 0
//
//


class Solution {
    private void reverse(int[] nums, int i, int j) {
        for (;i<j;++i,--j) {
            int tmp = nums[i];
            nums[i] =nums[j];
            nums[j] =tmp;
        }
    }
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return;
        int n = nums.length, m = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,m-1);
        reverse(nums,m,n-1);
    }
}
