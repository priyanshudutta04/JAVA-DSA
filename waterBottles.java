// 1518. Water Bottles

// There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

// The operation of drinking a full water bottle turns it into an empty bottle.

// Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.


// Runtime: 0ms      Memory:40.1MB

class Solution {
    
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=0;
        int empty=0;

        while(numBottles!=0){
            int c=numBottles;
            total+=numBottles;
            numBottles=(numBottles+empty)/numExchange;     
            empty=(c+empty)%numExchange;
        }
       
        return total;
    }
}
