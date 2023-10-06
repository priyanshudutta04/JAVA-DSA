import java.util.Scanner;




public class gcdRec {

    static int gcd(int x,int y){
        if(x%y==0){
            return x;        
        }

        return gcd(y,x%y);    

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y:");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Greatest Common Divisor is: "+gcd(x,y));
        
        sc.close();
    }
    
}
