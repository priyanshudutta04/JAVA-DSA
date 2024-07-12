// 1717. Maximum Score Remove Substring

// You are given a string s and two integers x and y. You can perform two types of operations any number of times.

// Remove substring "ab" and gain x points.
// For example, when removing "ab" from "cabxbae" it becomes "cxbae".
// Remove substring "ba" and gain y points.
// For example, when removing "ba" from "cabxbae" it becomes "cabxe".
// Return the maximum points you can gain after applying the above operations on s.


// Runtime: 365ms      Memory:45.24MB


class Solution {

    public int maximumGain(String s, int x, int y) {  

        int score = 0;
        StringBuilder sb = new StringBuilder(s);

        char fc='a';
        char sc='b';
        int fS=x;
        int sS=y;
  
        if(x<y){
            fc = 'b';
            sc = 'a';
            fS=y;
            sS=x;
        }
        
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == fc && sb.charAt(i + 1) == sc) {
                score += fS;
                sb.delete(i, i + 2);
                i = Math.max(-1, i - 2); 
            }
        }
  
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sc && sb.charAt(i + 1) == fc) {
                score += sS;
                sb.delete(i, i + 2);
                i = Math.max(-1, i - 2); 
            }
        }

        return score;
    }
   
}