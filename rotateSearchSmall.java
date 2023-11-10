// Program to find the index of the smallest element in a rotated sorted array
// All elements are unique

import java.util.Scanner;

public class rotateSearchSmall {

    static int smallestSearch(int arr[]){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        int n=arr.length;

        while(st<=end){
            int mid=st+ (end-st)/2;
            if(arr[mid]<=arr[n-1])
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
               
        }
        return ans;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size to input");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter rotated array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    
        int pos=smallestSearch(a);  
        System.out.println("Smallest Element found at position: "+pos);
        sc.close();
        
    }
    
}
