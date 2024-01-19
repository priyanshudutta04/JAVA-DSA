// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

// Implement the MyQueue class:

// void push(int x) Pushes element x to the back of the queue.
// int pop() Removes the element from the front of the queue and returns it.
// int peek() Returns the element at the front of the queue.
// boolean empty() Returns true if the queue is empty, false otherwise.


// Runtime: 0ms      Memory:41.27MB

import java.util.Stack;

class MyQueue {
    Stack<Integer> st= new Stack<>();
    Stack<Integer> copy= new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(st.isEmpty()) st.push(x);
        else{
            while(!st.isEmpty()){
                copy.push(st.pop());
            }
            st.push(x);
            while(!copy.isEmpty()){
                st.push(copy.pop());
            }
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.isEmpty()) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */