// Given an integer array nums, return the most frequent even element.

// If there is a tie, return the smallest one. If there is no such element, return -1.


// Runtime: 16ms      Memory:44.91MB


import java.util.HashMap;

public class mostFreqEven {
     public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int el:nums){
            if(el%2==0){
                if(!freq.containsKey(el)){
                    freq.put(el,1);
                }
                else{
                    freq.put(el,freq.get(el)+1);
                }
            }          
        }
        int mxFreq=0,ansKey=-1;
        for(var i:freq.entrySet()){
            if(i.getValue()>mxFreq){
                mxFreq=i.getValue();
                ansKey=i.getKey();
            }
            else if(i.getValue()==mxFreq && ansKey>i.getKey()){
                ansKey=i.getKey();
            }
        }
        return ansKey;
    }
}
