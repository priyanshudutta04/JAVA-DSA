// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.

// Runtime 5ms || Memory 48.89 mb


public class search2DSecond {
    public boolean searchMatrix(int[][] a, int t) {
        int n=a.length; //no of rows
        int m=a[0].length;
        int i=0;
        int j=m -1;
        while(i<n && j>=0){
            if(a[i][j]==t)
                return true;
            else if(t<a[i][j])
                j--;
            else
                i++;
        }
        return false;
    }  
}
