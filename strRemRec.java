// Q) Program to remove all occurences of "a" from a string using recursion:

import java.util.Scanner;

public class strRemRec {
    static String stringRemove(String s,int n){
        
        if(n==s.length())
            return "";        

        if(s.charAt(n)=='a')
            return stringRemove(s, n+1);
        else
            return s.charAt(n)+stringRemove(s, n+1);
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s= sc.next();
        String rem=stringRemove(s,0);
       
        System.out.println("After removing a's: "+rem);
        sc.close(); 
    }
}
