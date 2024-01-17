// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
// return the area of the largest rectangle in the histogram.


// Runtime: 113ms      Memory:57.25MB


import java.util.Stack;

public class largestRectHist {
        public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if(n==1) return heights[0];
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];
        int[] pse=new int[n];
        int max=-1;
        //indexes in stack
        st.push(n-1);
        nse[n-1]=n;
        pse[0]=-1;
        //nse
        for(int i=n-2;i>0;i--){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            if(st.isEmpty())
                nse[i] = n;    
            else
                nse[i] =st.peek(); 
            st.push(i);
        }
        //pse
        st.clear();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            if(st.isEmpty())
                pse[i] = -1;    
            else
                pse[i] =st.peek(); 
            st.push(i); 
        }
        //max area
        for(int i=1;i<n;i++){
            int ar=heights[i]*(nse[i]-pse[i]-1);
            if(ar>max)
                max=ar;
        }
        return max;
    }
}
