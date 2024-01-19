// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".


// Runtime: 1ms      Memory:41.30MB


import java.util.Arrays;

public class longComPref {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==1) return strs[0];
        Arrays.sort(strs);
        int min=Math.min(strs[0].length(),strs[n-1].length());
        int count=0;
        for(int i=0;i<min;i++){
            if(strs[0].charAt(i)==strs[n-1].charAt(i))
                count++;
            else break;
        }
        return strs[0].substring(0,count);
    }
}
