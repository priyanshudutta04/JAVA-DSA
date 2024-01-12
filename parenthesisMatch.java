// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.


// Runtime: 2ms      Memory:41.54MB


import java.util.Stack;

public class parenthesisMatch {
        public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
                st.push(ch);
            else{
                if(st.isEmpty())  
                    return false;  
                char top=st.peek();
                if(ch ==')'&& top =='(' || ch =='}'&& top=='{' || ch ==']'&& top=='[')
                    st.pop(); 
                else
                    return false;  
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}
