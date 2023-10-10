// Q) Program to solve frog jump question using Recursion

import java.util.Scanner;
import java.lang.Math;

public class frogRec {


    static int maxJump(int a[],int n, int idx){
        

        if(idx==n-1){
            
            return 0;
        }
        int r1=maxJump(a, n, idx+1);
        

        int op1=Math.abs(a[idx]-a[idx+1])+r1;
        
        if(idx==n-2){
            return op1;
        }
        int r2=maxJump(a, n, idx+2);
        int op2=Math.abs(a[idx]-a[idx+2])+r2;
            
        return Math.min(op1, op2);

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Enter array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Minimum Cost: "+maxJump(a, a.length, 0));
        sc.close();
    }
    
}
