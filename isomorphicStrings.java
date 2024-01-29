// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. 
// No two characters may map to the same character, but a character may map to itself.


// Runtime: 11ms      Memory:42.24MB


import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            char val=t.charAt(i);
            if(map.containsKey(key)){
                if(map.get(key) != val)
                    return false;
            }
            else{
                if(map.containsValue(val))
                    return false;
                map.put(key,val);
            }
        }
        return true;
    }
}
