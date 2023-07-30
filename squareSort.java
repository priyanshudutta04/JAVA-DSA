import java.util.Scanner;
import java.lang.*;

public class squareSort {
    public static void main(String[] args) {
        System.out.println("Enter Array length"); 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter Array Elements in Non decreasing Order"); 
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int left=0;
        int right=a.length-1;
        int ans[]=new int[n];
        int k=0;

        while(left<=right){
            if(Math.abs(a[left])> Math.abs(a[right])){
                ans[k]=a[left]*a[left];
                left++;
                k++;
            }
            else{
                ans[k]=a[right]*a[right];
                right--;
                k++;
            }
        }

        System.out.println("Sorted Array in Non Decreasing Order:"); 
        for(int i=n-1;i>=0;i--){          
            System.out.print(ans[i]+"\t");
        }    

    }
    
}
