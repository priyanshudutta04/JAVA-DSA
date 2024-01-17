// You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

// Return a list answer of size 2 where:

//      answer[0] is a list of all players that have not lost any matches.
//      answer[1] is a list of all players that have lost exactly one match.

// The values in the two lists should be returned in increasing order.


// Runtime: 27ms      Memory:92.96MB



import java.util.ArrayList;
import java.util.List;

public class zeroOrOneLoss {
    public List<List<Integer>> findWinners(int[][] matches) {
        int loss[] =new int[100001];
        List<List<Integer>> result = new ArrayList<>();
        int max=0;
        for(int i=0;i<matches.length;i++){
            int w=matches[i][0];
            int l=matches[i][1];
            int m=Math.max(w,l);
            if(m>max)  max=m;
            if(loss[w]==0)
                loss[w]=-1;
            if(loss[l]==-1)
                loss[l]=1;
            else{
                loss[l]++;
            }
        }
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for(int i=0;i<max+1;i++){
            if(loss[i]==-1){
                zero.add(i);
            }
            if(loss[i]==1){
            one.add(i);
            }
                
        }
        result.add(zero);
        result.add(one);
        return result;
    }
}
