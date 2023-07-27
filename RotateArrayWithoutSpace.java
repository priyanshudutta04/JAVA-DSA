

class RotateArrayWithoutSpace{

    static void reverseArray(int a[],int i,int r,int off){
        int t;               
        if(i>r/2){
            for (int j = i; j < (r / 2) + off; j++) {
                t = a[j];
                a[j] = a[r + off - j];
                a[r + off - j] = t;
            }

        }
        else{
            for (int j = i; j < (r / 2) ; j++) {
                t = a[j];
                a[j] = a[r - j -1];
                a[r - j -1] = t;
            }
        }     
    }

    public static void main(String args[]){

        int k=2;
        int n=5;
        k=k%n;
        int a[]={3,4,5,7,8};

        reverseArray(a,0,n-k,0);
        reverseArray(a,n-k,n,k);
        reverseArray(a,0,n,0);


        System.out.println("Rotated Array");
        for(int i=0;i<n;i++){
            System.out.println("\t"+a[i]);
        }
    }
}