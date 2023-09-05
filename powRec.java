// Q) Given two numbers p & q, find the value p^q using recursion 

import java.util.*;

public class powRec {

    static int power(int p,int q){
        if(q==0){
            return 1;        
        }
            
        return power(p,q-1) *p;  
    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p and q:");
        int p= sc.nextInt();
        int q= sc.nextInt();
        System.out.println("Summation is: "+power(p,q));
        
        sc.close();
    }
    
}


