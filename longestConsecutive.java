// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.


// Runtime: 27ms      Memory:67.97MB


import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st= new HashSet<>();
        for(int i:nums) st.add(i);
        int m=0;
        for(int i:st){
            if(!st.contains(i-1)){
                int c=1;
                while(st.contains(i+1)){
                    c++;
                    i++;
                }  
                m=Math.max(m,c);
            }
        }
        return m;
    }
}
