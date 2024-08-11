// 42. Trapping Rain Water

// Given n non-negative integers representing an elevation map where the width of each bar is 1, 
// compute how much water it can trap after raining.


// Runtime: 1ms      Memory:45.88MB

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int l=0;int r=0;
        for(int i=0;i<n;i++){
            left[i]=Math.max(l,height[i]);
            l=left[i];
        }
        for(int i=n-1;i>=0;i--){
            right[i]=Math.max(r,height[i]);
            r=right[i];
        }

        int total=0;
        for(int i=1;i<n-1;i++){
           if(left[i]>height[i] && right[i]>height[i])
            total+=Math.min(left[i],right[i])-height[i];     
        }

        return total;
    }
}