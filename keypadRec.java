// Q) Program to return all possible letter combinations that the number could represent using Recusrion.
//    Keypad problem

import java.util.Scanner;

public class keypadRec {

    static void combinations(String dig,String[] keypad,String res){
        if(dig.length()==0){
            System.out.println(res+" ");
            return;
        }
        int num=dig.charAt(0)-'0'; 
        String choices =keypad[num];
        for(int i=0;i<choices.length();i++){
            combinations(dig.substring(1),keypad,res+choices.charAt(i));
        }


    }

    public static void main(String args[]){

        String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s= sc.next();
        combinations(s, keypad, "");
        sc.close();
    }
    
}
