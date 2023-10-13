// Q) Program to implement quick sort:

import java.util.Scanner;

public class quickSort {


     

    static int partition(int[] arr, int st, int end){

        int pivot = arr[st];
        int cnt = 0;

        //finding position of pivot index
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;

        int temp = arr[st];
        arr[st] = arr[pivotIdx];
        arr[pivotIdx] = temp;
        
        int i = st, j = end;
        // putting elemnts ;esser than pivot in left and greater in right
        while(i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quick(int[] arr, int st, int end){

        if(st >= end) return;

        int p = partition(arr, st, end);
        quick(arr, st, p-1);
        quick(arr, p+1, end);
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
        quick(a, 0, n-1);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
