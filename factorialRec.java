// Q) // Q) Program to Print Factorial of a Number using Recursion:

import java.util.*;

public class factorialRec {

    static int printReverse(int n){
        if(n==0){
            return 1;        
        }
            
        return n*printReverse(n-1);    
    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Factorial is: "+printReverse(n));
        
        sc.close();
    }
    
}

