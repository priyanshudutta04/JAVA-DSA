// Q) Program to implement linear search using recursion:

import java.util.Scanner;

public class linearSearchRec {

    static int arrMax(int arr[],int n,int t){
        
        if(n==arr.length)
            return -1;        

        if(arr[n]==t)
            return n+1;
        
        return arrMax(arr, n+1,t);
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Enter array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int t= sc.nextInt();
        int pos=arrMax(a, 0,t);
        if(pos==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: "+pos);
        sc.close(); 
    }
    
}
