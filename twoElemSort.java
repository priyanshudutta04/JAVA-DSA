// Q) Program to swap two elements in a sorted array in linear time.

import java.util.Scanner;

public class twoElemSort {

    static void swapVal(int arr[]){

        int x=0,y=0;
        boolean flag=false;
         for(int i=1;i<arr.length;i++){
            if(arr[i]< arr[i-1]){
                if(flag==false){            //1st conflict
                    x=i-1;
                    flag=true;
                }
                else{                       //2nd conflict
                    y=i;
                    flag=false;
                }             
            }
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
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
        swapVal(a);
        for(int el:a){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
