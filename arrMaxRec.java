// Q) Program to find the maximum value and summation of an array using Recursion:

import java.util.*;
import java.lang.Math;
 
public class arrMaxRec {

    static int arrMax(int arr[],int n){
        
        if(n==0){
            return arr[n];        
        }
        
        return Math.max(arr[n],arrMax(arr, n-1));
    }

    static int sumElem(int arr[],int n){
        
        if(n==0){
            return arr[n];        
        }
        
        return arr[n]+sumElem(arr, n-1);
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
        int max=arrMax(a, n-1);
        System.out.println("Max element is: "+max);
        int sum=sumElem(a, n-1);
        System.out.println("Summation is: "+sum);
        sc.close(); 
    }
}
