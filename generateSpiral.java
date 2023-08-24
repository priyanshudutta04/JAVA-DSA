// Q) Program to generate a n * n matrix, filled with elements from 1 to n^2 in spiral order

import java.util.Scanner;

public class generateSpiral {

    static int[][] spiralAdd(int[][] matrix,int n){
        Scanner in=new Scanner(System.in);
        int top=0,bottom=n-1,left=0,right=n-1;
        int k=0;
        while(k<n*n){
            for(int j=left;j<=right && k<n*n;j++){
                matrix[top][j]=k+1;
                k++;
            }
            top++;
             for(int i=top;i<=bottom && k<n*n;i++){
                matrix[i][right]=k+1;
                k++;
            }
            right--;
             for(int j=right;j>=left && k<n*n;j--){
                matrix[bottom][j]=k+1;
                k++;
            }
            bottom--;
             for(int i=bottom;i>=top && k<n*n;i--){
                matrix[i][left]=k+1;
                k++;
            }
            left++;
        }
        in.close();
        return matrix;  
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter n: "); 
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("\nGenerating elements in spiral order: "); 
        arr=spiralAdd(arr,n);
        System.out.println("\nMatrix output: ");
         for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
          } 
          System.out.println();
        }
        sc.close();
    }
}
