// 39. Combination Sum

// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
// frequency
//  of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.


// Runtime: 4ms      Memory:45.15MB

import java.util.*;

class Solution {
    static List<List<Integer>> ans;
    static Set<List<Integer>> set = new HashSet<>();

    static void dfs(int sum,int target,int nums[], List<Integer> combs,int idx){
        if(sum>target) return;
        if(sum==target && !set.contains(combs) ){     
            ans.add(new ArrayList<>(combs));
            set.add(combs);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            combs.add(nums[i]);
            dfs(sum + nums[i],target,nums,combs,idx);
            combs.remove(combs.size() - 1);
            idx++;
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> combs=new ArrayList<>();
        dfs(0,target,candidates,combs,0);
        return ans;
    }
}

