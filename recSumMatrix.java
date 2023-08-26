/*  Q) Given a matrix of dimension n*m and 2 coordinates l1,r1 and l2,r2. 
    Return the sum of the rectangle formed by these matrices.  
    Given l2>=l1 and r2>=r1. 0<=l1,l2<n. 0<=r1,r2<m.                    */



import java.util.Scanner;

public class recSumMatrix {
    static Scanner sc=new Scanner(System.in);
    static int[][] addElements(int arr[][], int r, int c){
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();
        }
        
        return arr;  
    }

    static void printMatrix(int[][] arr,int r,int c){
        System.out.println("The Matrix is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }  
    }

    static void printRectangle(int[][] arr,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++)
               sum+=arr[i][j];     
        }
        System.out.println("Sum of rectangle formed by two coordinates is : " +sum);
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and m");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter array elements");
        arr=addElements(arr, n, m);
        printMatrix(arr, n, m);
        System.out.println("Enter 1 st coordinate");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("Enter 2 nd coordinate");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        printRectangle(arr,l1,r1,l2,r2);

        sc.close();
    }
}
