// Q) Program to check if a string is palindrome or not using recursion:

import java.util.Scanner;

public class palindromeRec {
    static String stringRemove(String s,int n){
        
        if(n==s.length())
            return "";        


            return stringRemove(s, n+1)+s.charAt(n);
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s= sc.next();
        String rem=stringRemove(s,0);
        if(rem.equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
        
}
