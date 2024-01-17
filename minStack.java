// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.

// You must implement a solution with O(1) time complexity for each function.


// Runtime: 5ms      Memory:44.95MB

import java.util.Stack;

public class minStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public minStack() {
        
    }
    
    public void push(int val) {

        if(st.isEmpty()){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(val>min.peek()){
                min.push(min.peek());
            }
            else{
                min.push(val);
            }
        }      
    }
    
    public void pop() {    
        min.pop();
        st.pop();   
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
