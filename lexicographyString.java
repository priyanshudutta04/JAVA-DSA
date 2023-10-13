// Q) Program to sort strings in lexicographical order using insertion sort:

import java.util.Scanner;

public class lexicographyString {

    static void lexicoCompare(String[] lex){
        int n=lex.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(lex[j].compareTo(lex[min])<0)
                {   
                    min=j;
                }
            }
            if(min!=i){
                String temp=lex[i];
                lex[i]=lex[min];
                lex[min]=temp;
            }
        }
    }




    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Enter array:");
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        lexicoCompare(s);
        for(String el:s){
            System.out.print(el +"\t");
        }
        sc.close();
    }
    
}
