// Q) program to print elements of a matrix in spiral order

import java.util.Scanner;

public class spiralMatrix {

    static void spiralOrder(int[][] matrix,int r,int c){
        int top=0,bottom=r-1,left=0,right=c-1;
        int k=r*c;
        while(k>0){
            for(int j=left;j<=right && k>0;j++){
                System.out.print(matrix[top][j]+" ");
                k--;
            }
            top++;
             for(int i=top;i<=bottom && k>0;i++){
                System.out.print(matrix[i][right]+" ");
                k--;
            }
            right--;
             for(int j=right;j>=left && k>0;j--){
                System.out.print(matrix[bottom][j]+" ");
                k--;
            }
            bottom--;
             for(int i=bottom;i>=top && k>0;i--){
                System.out.print(matrix[i][left]+" ");
                k--;
            }
            left++;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter no of rows and columns: "); 
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("\nEnter matrix elements: ");
        for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
          } 
        }
        System.out.println("\nSpiral Order Matrix: "); 
        spiralOrder(arr,r,c);
        sc.close();
    }
}
