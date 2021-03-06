// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
// Example:
//
//
// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
//
// Note:
//
//
// 	You must do this in-place without making a copy of the array.
// 	Minimize the total number of operations.
//


class Solution {
    public void moveZeroes(int[] nums) {
        if (nums==null || nums.length==0) return;        
        int slow=0;
        for (int fast = 0; fast<nums.length;++fast) {
            if (nums[fast] != 0) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                ++slow;
            }
        }
    }
}
