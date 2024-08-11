// 1460. Make Two Arrays Equal by Reversing Subarrays


// You are given two integer arrays of equal length target and arr. In one step, you can select 
// any non-empty subarray of arr and reverse it. You are allowed to make any number of steps.

// Return true if you can make arr equal to target or false otherwise.

// Runtime: 3ms      Memory:44.09MB

import java.util.Arrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(target[i]!=arr[i])
                return false;
        }
        return true;
    }
}