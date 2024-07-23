// 2418. Sort the People

// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.


// Runtime: 7ms      Memory:45.28MB

import java.util.*;

class Solution {

    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> map=new HashMap<>();

        for(int i=0;i<heights.length;i++)
            map.put(heights[i],names[i]);
            
        Arrays.sort(heights);
        int c=0;

        for(int i=heights.length-1;i>=0;i--)
            names[c++]=(map.get(heights[i]));

        return names;       
    }
}
