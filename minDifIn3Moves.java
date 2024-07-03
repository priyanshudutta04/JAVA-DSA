// 1509. Minimum Difference Between Largest and Smallest Value in Three Moves

// You are given an integer array nums.

// In one move, you can choose one element of nums and change it to any value.

// Return the minimum difference between the largest and smallest value of nums after performing at most three moves.


// Runtime: 15ms      Memory:57.3MB


import java.util.Arrays;

class Solution {

    public int minDifference(int[] nums) {
        int l=nums.length;
        if(nums.length<5)
            return 0;
        Arrays.sort(nums);

        int min1=nums[l-4]-nums[0];
        int min2=nums[l-1]-nums[3];
        int min3=nums[l-3]-nums[1];
        int min4=nums[l-2]-nums[2];

        int m1=Math.min(min1,min2);
        int m2=Math.min(min3,min4);
        return Math.min(m1,m2);

    }
    
}