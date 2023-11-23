



public class racingKids {

    static boolean isDivPos(int a[],int n,int minDist){
        int kids=1;
        int k=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-k<minDist){
                continue;
            }
            else{
                k=a[i];
                kids++;
            }
        }
        if(kids >= n)
            return true;
        else
            return false;
    }

    static int distribute(int a[],int m){
        if(a.length<m)
            return -1;
        int ans=-1;
        int st=0;
        int end= (int) 1e9;

        while(st<=end){
            int mid=st+ (end-st)/2;
            if(isDivPos(a,m,mid)){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        int a[]={1,2,4,8,9};
        int kids=3;
        System.out.println(distribute(a, kids));

    }
}
