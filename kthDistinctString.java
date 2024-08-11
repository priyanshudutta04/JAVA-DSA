// 2053. Kth Distinct String in an Array

// A distinct string is a string that is present only once in an array.

// Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
// If there are fewer than k distinct strings, return an empty string "".

// Note that the strings are considered in the order in which they appear in the array.


// Runtime: 6ms      Memory:44.16MB

import java.util.HashMap;

class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map=new HashMap<>();
        for(String s:arr){
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }

        int c=1;
        for(String s:arr){
            if(map.get(s)==1){
                if(c==k)
                    return s;
                c++;
            }
        }
        return "";
    }
}
