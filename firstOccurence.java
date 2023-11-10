// Program to find the first occurence of an elemnent in a sorted array, using binary search


import java.util.Scanner;

public class firstOccurence {

    static int firstOcc(int arr[],int k){
        int l=0;
        int u=arr.length-1;
        int fo=-1;
        while(l<=u){
            int m=l+ (u-l)/2;
            if(k==arr[m]){
                fo=m;
                u=m-1;
            }
            else if(k<arr[m])
                u=m-1;
            else
                l=m+1;
        }
        return fo;
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
        int pos=firstOcc(a, t);
        if (pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element's first occurence found at position: "+pos);
        sc.close();
        
    }
    
}
