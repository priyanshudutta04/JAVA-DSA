// Q) Segregrate an array with all negative numbers first followed by all
//    positive numbers in linear time

import java.util.Scanner;

public class posNegSplit {

    static void partition(int[] arr){

        int st=0;
        int end=arr.length;
        int pivot = 0;
        int cnt = 0;

        for(int i = st; i < end; i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
   
        int i = st, j = end-1;

        while(i < pivotIdx && j >= pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotIdx && j >= pivotIdx){
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
                i++;
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
        partition(a);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
