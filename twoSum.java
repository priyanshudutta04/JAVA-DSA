// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.



// Runtime: 2ms      Memory:44.74MB


import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        int ans[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = mp.get(target - nums[i]);
                return ans;
            }    
            mp.put(nums[i],i);     
        }
        return ans;
    }
}