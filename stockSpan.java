// Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.

// The span of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) 
// for which the stock price was less than or equal to the price of that day.


// Runtime: 32ms      Memory:55.40MB

import java.util.Stack;

public class stockSpan {

    Stack<int[]> st;
    int counter=0;
    public stockSpan() {
    st=new Stack<>();
    } 

    public int next(int price) {
        int span=1;
        counter++;
        while(!st.isEmpty() &&  price >= st.peek()[0] ){
            span+=st.peek()[1];
            st.pop();
        }
        st.push(new int[] {price, span});
        
        return span;
    }
}
