// You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.

// A triangle is called equilateral if it has all sides of equal length.
// A triangle is called isosceles if it has exactly two sides of equal length.
// A triangle is called scalene if all its sides are of different lengths.
// Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle.


// Runtime: 0ms      Memory:41.61MB


class Solution {
    public String triangleType(int[] nums) {
        int a1=nums[0];
        int a2=nums[1];
        int a3=nums[2];

        if(a1+a2>a3 && a2+a3>a1 && a1+a3>a2){
            if(a1==a2 && a2==a3){
                return "equilateral";
            }
            else if(a1==a2 || a2==a3 || a1==a3){
                return "isosceles";
            }
            return "scalene";
        }

        return "none";
    }
}