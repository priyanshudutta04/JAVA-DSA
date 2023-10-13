// Q) Program to implement merge sort:

import java.util.Scanner;

public class mergeSort {

     static void merge(int arr[],int l,int mid,int r){
        int n1=mid+1-l;
        int n2=r-mid;

        // Creating two subarrays
        int left[]=new int[n1];  
        int right[]=new int[n2];

        // Filling the two subarrays
        for(int a=0;a<n1;a++)
        left[a]=arr[l+a];    
        for(int b=0;b<n2;b++)
        right[b]=arr[mid+1+b];

        int i=0,j=0,k=l;

        //compare adjacent elements in the two arrays and add the smallest among them
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }

        // Corner cases : When elements remain in any of the subarrays left to be added
        while(i<n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }
     }
     

    static void mergeS(int arr[],int l,int r){

        if(l>=r){
            return;
        }
        int mid=(l+r)/2;

        mergeS(arr, l, mid);
        mergeS(arr, mid+1, r);
        merge(arr,l,mid,r);
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
        mergeS(a, 0, n-1);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
