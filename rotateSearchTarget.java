// Program to find the index of the target element in a rotated sorted array
// All elements are unique


import java.util.Scanner;

public class rotateSearchTarget {

    static int targetSearch(int a[],int k){
        int st=0;
        int end=a.length-1;

        while(st<=end){
            int mid=st +(end-st)/2;
            if(a[mid]==k)
                return mid;
            else{
                if(a[mid]<a[end]){
                    if(k>mid && k<=end)
                        st=mid+1;
                    else
                        end=mid-1;
                }
                else{
                    if(k>=st && k<mid)
                        end=mid-1;
                    else
                        st=mid+1;
                }
            }
        }
        return -1;
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
        int pos=targetSearch(a, t);
        if (pos==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: "+pos);
        sc.close();
        
    }
    
}
