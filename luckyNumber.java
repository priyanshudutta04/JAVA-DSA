// 1380. Lucky Numbers in a Matrix

// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.


// Runtime: 2ms      Memory:45.57MB


class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int j=0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    idx=j;
                }
                    
            }
            int flag=0;
            for(int[] k:matrix){
                if(min<k[idx]){            
                    flag=1;
                    break;
                }    
            }
            if(flag==0){
                ans.add(min);
                return ans;
            }
        }
        return ans;
    }
}
