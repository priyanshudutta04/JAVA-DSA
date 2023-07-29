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

        int zeroes=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                zeroes++;
            if(a[i]!=0 && a[i]!=1)
                System.exit(0);
        }

        for(int i=0;i<n;i++){
            if(i<zeroes)
                a[i]=0;
            else
                a[i]=1;
        }

        System.out.println("Sorted Array:"); 
         for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t"); 
        }
        
    }
}
