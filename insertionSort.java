// Q) Program to implement insertion sort:

import java.util.Scanner;

public class insertionSort {
        
    static void insertion(int arr[]){

       int n=arr.length;

       for(int i=1;i<n;i++){
        int k=arr[i];
        int j=i;
        while( j>0 && arr[j]<arr[j-1] )  //check j>0 before arr[j]<arr[j-1]
        {
            k=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=k;
            j--;
        }
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
        insertion(a);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
}
