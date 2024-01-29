// Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two 
// out of the three arrays. You may return the values in any order.


// Runtime: 5ms      Memory:44.30MB


import java.util.*;
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for(int i: nums1) 
            set1.add(i); 

        for(int i: nums2){
            if(set1.contains(i) && !arr.contains(i))       
                arr.add(i);
            set2.add(i); 
        } 
        for(int i: nums3){
            if((set1.contains(i) || set2.contains(i)) && !arr.contains(i)) 
                arr.add(i);  
            set3.add(i);
        } 
        return arr;

    }
}
