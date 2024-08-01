// 1653. Minimum Deletions to Make String Balanced


// You are given a string s consisting only of characters 'a' and 'b'​​​​.

// You can delete any number of characters in s to make s balanced. s is balanced if there is no pair of indices (i,j) such that i < j and s[i] = 'b' and s[j]= 'a'.

// Return the minimum number of deletions needed to make s balanced.


// Runtime: 22ms      Memory:45.3MB


class Solution {
    public int minimumDeletions(String s) {

        int b=0;
        int ans=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
               b++;
            }
            else{
                if(b!=0){
                    b--;
                    ans++;
                }
                   
            }
        }
        return ans;
    }
}