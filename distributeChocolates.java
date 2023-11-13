// Given number of chocolates in N different bags and M children.

// Every kid will get some consecutive bags. 

// The task is to distribute chocolates in such a way that the maximum 
// number of chocolates assigned to a kid is minimum.


public class distributeChocolates {

    static boolean isDivPos(int a[],int n,int maxChoc){
        int students=1;
        int choc=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxChoc)
                return false;
            if(choc+a[i]<=maxChoc){
                choc+=a[i];
            }
            else{
                students++;
                choc=a[i];
            }
        }
        return students <=n;
    }

    static int distribute(int a[],int m){
        if(a.length<m)
            return -1;
        int ans=0;
        int st=1;
        int end= 1000;

        while(st<=end){
            int mid=st+ (end-st)/2;
            if(isDivPos(a,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        int a[]={12,34,67,90};
        int m=2;
        System.out.println(distribute(a, m));

    }
}
