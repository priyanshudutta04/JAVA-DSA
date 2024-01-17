// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.


// Runtime: 1ms      Memory:50.78MB


public class majorElem {
    public int majorityElement(int[] nums) {      
        int c=0;
        int el=-1;
        for(int i=0;i<nums.length;i++){
            if(c==0)
                el=nums[i];
            if(nums[i]==el)
                c++;
            else
                c--;
        }
        return el;
    }
}
