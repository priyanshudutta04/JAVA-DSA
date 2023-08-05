import java.util.Scanner;

public class prefixSum {

    static int[] prefSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter Array length"); 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Array Length"); 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=prefSumArray(arr);
        System.out.println("Prefix Array:"); 
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+"\t"); 
        }

    }

    
}
