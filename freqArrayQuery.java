import java.util.*;

public class freqArrayQuery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int freq[]= new int[10^5];
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            freq[a[i]]+=1;
        }
        System.out.println("Enter Query"); 
        int q=sc.nextInt();
        int query[]=new int[q];
        for(int i=0;i<q;i++){
            query[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            if(freq[query[i]]>0)
                System.out.println("YES"); 
            else
                System.out.println("NO");
        }
    }
}
