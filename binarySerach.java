// Q) Program to implement binary search:


import java.util.Scanner;

public class binarySerach {

    static int binary(int arr[],int k){
        int l=0;
        int u=arr.length-1;
        while(l<=u){
            int m=l+ (u-l)/2;
            if(k==arr[m])
                return m;
            else if(k<arr[m])
                u=m-1;
            else
                l=m+1;
        }
        return -1;
    }

    static int recBinary(int arr[],int k,int l,int u){
        if(l>u)         //base case
            return -1;
        int m=l+ (u-l)/2;
        if(k==arr[m])
            return m;
        else if(k<arr[m])
            recBinary(arr, k, l, m-1);
        else
            recBinary(arr, k, m+1, u);  
        return-1;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size to input");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array to input");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int t=sc.nextInt();
        int pos=binary(a, t);
        if (pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: "+pos);
        sc.close();
        
    }

    
}


