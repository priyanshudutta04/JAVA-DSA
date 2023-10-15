// Q) Program to implement count sort:

import java.util.Scanner;

public class countSort {


    static void count(int[] arr, int m){
        int freq[]=new int[m+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]+=1;
        }
        int k=0;
        for(int i=0;i<freq.length;i++){
            for(int j=0;j<freq[i];j++){
                arr[k++]=i;
            }
        }
    }

     public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Enter max element:");
        int max= sc.nextInt();
        System.out.println("Enter array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        count(a,max);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
