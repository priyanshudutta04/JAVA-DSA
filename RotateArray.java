//Q) Program to rotate an 1 D array


class RotateArray{
    
    public static void main(String args[]){
        
        int k=4;
        int n=6;
        k=k%n;
        int a[]={3,4,5,8,6,7};

        int ans[]=new int[100];

        int j=0;
        for(int i=n-k;i<n;i++,j++){
            ans[j]=a[i];
        }
        for(int i=0;i<n-k;i++,j++){
            ans[j]=a[i];
        }

        System.out.println("Rotated Array");
        for(int i=0;i<n;i++){
            System.out.println("\t"+ans[i]);
        }
    }
}