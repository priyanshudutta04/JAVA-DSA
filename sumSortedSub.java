// 1508. Range Sum of Sorted Subarray Sums

// You are given the array nums consisting of n positive integers. 
// You computed the sum of all non-empty continuous subarrays from the array and then sorted them in non-decreasing order, 
// creating a new array of n * (n + 1) / 2 numbers.

// Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array. 
// Since the answer can be a huge number return it modulo 109 + 7.


// Runtime: 64ms      Memory:46.37MB

import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sub=new int[n * (n + 1) / 2];

        int k=0;
        for(int i=0;i<n;i++){
            int current=0;
            for(int j=i;j<n;j++){
                current+=nums[j];
                sub[k++]=current;
            }      
        }

        Arrays.sort(sub);

        int mod=(int) 1e9 + 7;
        int sum=0;
        for(int i=left-1;i<right;i++){
            sum=(sum+sub[i])%mod;
        }    

        return sum;
    }
}
