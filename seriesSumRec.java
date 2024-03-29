// Q) Program to find sum of the following series using Recursion:
// 1 -2 +3 -4 ....+-n

import java.util.Scanner;

public class seriesSumRec {

    static int series(int n){
        if(n==0){
            return 0;        
        }
        if(n%2==0){
            return series(n-1)-n;    
        }
        return series(n-1)+n;    

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        System.out.println("Summation is: "+series(n));
        
        sc.close();
    }
    
}
