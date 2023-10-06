// Q) Program to Print multiple of a number till kth term using Recursion:

import java.util.*;

public class multipleRec {


    static void printMultiple(int n,int k){
        if(k==0){
            return;        
        }
        
        printMultiple(n,k-1);    
        System.out.print(n*k+"\t");
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Enter k:");
        int k= sc.nextInt();
        printMultiple(n, k);
        
        sc.close();
    }
    
}

