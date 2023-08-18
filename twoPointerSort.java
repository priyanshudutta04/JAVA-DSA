import java.util.*;

public class twoPointerSort {
    public static void main(String[] args) {
        System.out.println("Enter Array length"); 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter Array Elements(0/1)"); 
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int left=0;
        int right=a.length-1;

        while(left<right){
            if(a[left]==1 && a[right]==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            else if(a[left]==0){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println("Sorted Array:"); 
        for(int i=0;i<n;i++){
           System.out.print(a[i]+"\t"); 
        }    
        sc.close();
    }
}
