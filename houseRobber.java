// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
// the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and 
// it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight 
// without alerting the police.


// Runtime: 0ms      Memory:40.92MB


class Solution {
    public int rob(int[] nums) {
        int cur = 0;
        int best = 0;

        for(int i=0;i<nums.length;i++){
            int temp=cur;
            cur=best+nums[i];
            best=Math.max(temp,best);
        }
        return Math.max(cur,best);
    }
}