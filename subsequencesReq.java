import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class subsequencesReq {

    static ArrayList<String> subseq(String s){
        ArrayList<String> ans=new ArrayList<>();

        if(s.length()==0){
            ans.add("");
            return ans;
        }
            


        char c=s.charAt(0);
        ArrayList<String> smallAns=subseq(s.substring(1));    //self work

        for(String ss: smallAns){
            ans.add(ss);
            ans.add(c+ss);
        }
        return ans;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s= sc.next();
        ArrayList<String> ans= subseq(s);
        for(String ss:ans){
            System.out.print(ss+"\t");
        }
    }
    
}
