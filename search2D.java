
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Runtime 0ms || Memory 41.5 mb


public class search2D {

    public boolean searchMatrix(int[][] a, int target) {
        int n=a.length;     //no of rows
        int m=a[0].length;  //no of columns
        int st=0;
        int end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int mi=mid/m;   //row number of mid element
            int mj=mid%m;   //column number of mid element
            if(target==a[mi][mj])
                return true;
            else if(target<a[mi][mj])
                end=mid-1;
            else
                st=mid+1;
        }
        return false;
    }
}
