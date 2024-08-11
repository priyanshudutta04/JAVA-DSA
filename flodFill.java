// 733. Flood Fill

// An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

// You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

// To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color 
// as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. 
// Replace the color of all of the aforementioned pixels with color.

// Return the modified image after performing the flood fill.


// Runtime: 0ms      Memory:44.75MB

class Solution {

    void dfs(int sr,int sc,int color,int[][] ans,int target,int m,int n){
        ans[sr][sc]=color;

        if(sr-1>=0 && ans[sr-1][sc]==target)
            dfs(sr-1,sc,color,ans,target,m,n);
        
        if(sc-1>=0 && ans[sr][sc-1]==target)
            dfs(sr,sc-1,color,ans,target,m,n);

        if(sr+1<m && ans[sr+1][sc]==target)
            dfs(sr+1,sc,color,ans,target,m,n);

        if(sc+1<n && ans[sr][sc+1]==target)
            dfs(sr,sc+1,color,ans,target,m,n);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        if (image[sr][sc] == color) return image;
        dfs(sr,sc,color,image,image[sr][sc],m,n);
        return image;
    }
}