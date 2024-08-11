// 55. Jump Game

// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum 
// jump length at that position.

// Return true if you can reach the last index, or false otherwise.

// Runtime: 3ms      Memory:45.71MB

class Solution {
    public boolean canJump(int[] nums) {
        int step=0;
        for(int i=0;i<nums.length;i++){
            if(step<0)
                return false;
            step=Math.max(nums[i],step);
            step--;
        }
        return true;
    }
}
