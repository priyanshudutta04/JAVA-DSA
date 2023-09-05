// Q) Program to Print Sum of Digits using Recursion:

import java.util.*;

public class sumRec {

    static int sum(int n){
        if(n/10==1 || n/10==0){
            return n;        
        }
            
        return sum(n/10) +n%10;  
    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Summation is: "+sum(n));
        
        sc.close();
    }
    
}


