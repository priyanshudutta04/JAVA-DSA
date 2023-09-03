// Q) Print natural numbers in reverse order using recursion

import java.util.*;

public class natNumbersRec {

    static void printReverse(int n){
        if(n==1){
            System.out.println(n);
            return;        
        }
        
        System.out.println(n);
        printReverse(n-1);
        
    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        printReverse(n);
        sc.close();
    }
    
}
