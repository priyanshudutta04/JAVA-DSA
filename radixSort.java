// Q) Program to implement radix sort:

import java.util.Scanner;

public class radixSort {

    static int maxElem(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }

    static void countSort(int[] arr, int place){

        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < arr.length; i++){ // Make frequency array
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum array of count array
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }
        for(int i = n-1; i >= 0; i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all elements of output to arr
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    static void radix(int arr[]){

        int max=maxElem(arr);

        int place=1;
        int c=max;
        while(c!=0){
            place*=10;
            countSort(arr, place);
            c=c/10;
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
        radix(a);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
