// Q) Program to implement bubble sort:

import java.util.Scanner;

public class zeroesSorting {

    static void moveZeroes(int arr[]){

        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
                return;
        }
    }

     public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Enter array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        moveZeroes(a);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
