import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int rev[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=n-1,j=0;i>=0;i--,j++){
            rev[j]=a[i];
        }

        for(int i=0;i<n;i++){
           System.out.println(rev[i]); 
        }

        
    }
}