// Q) Check if an array can be partitioned into two sub arrays with equal sum

import java.util.Scanner;

public class subPartition {

    static int pos=-1;

    static int[] prefSumArray(int[] arr){
        for(int i=1;i<arr.length;i++)
            arr[i]+=arr[i-1];
        return arr;
    }

    static boolean partition(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[arr.length-1]-arr[i]==arr[i]){
                pos=i+1;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter Array length"); 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Array Elements"); 
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        arr=prefSumArray(arr);

        if(partition(arr))
            System.out.println("Array Can be divided at position: "+pos); 
        else
            System.out.println("Can not be divided"); 

        sc.close();
    }
}
