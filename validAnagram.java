// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
// typically using all the original letters exactly once.


// Runtime: 16ms      Memory:44.32MB


import java.util.HashMap;

class Solution {

    static HashMap<Character, Integer> makeMap(String str){
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!map.containsKey(c)){
                    map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        return map;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> m1=makeMap(s);
        HashMap<Character, Integer> m2=makeMap(t);
        if(m1.equals(m2)) return true;
        return false;
    }
}
