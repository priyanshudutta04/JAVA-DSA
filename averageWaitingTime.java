// 1701. Average Waiting Time

// There is a restaurant with a single chef. You are given an array customers, where customers[i] = [arrivali, timei]:

// arrivali is the arrival time of the ith customer. The arrival times are sorted in non-decreasing order.
// timei is the time needed to prepare the order of the ith customer.
// When a customer arrives, he gives the chef his order, and the chef starts preparing it once he is idle. The customer waits till the chef finishes preparing his order. The chef does not prepare food for more than one customer at a time. The chef prepares food for customers in the order they were given in the input.

// Return the average waiting time of all customers. Solutions within 10-5 from the actual answer are considered accepted.


// Runtime: 3ms      Memory:72.83MB


class Solution {
    public double averageWaitingTime(int[][] customers) {

        double total=0;
        int start=0;
        for(int i=0;i<customers.length;i++){
            int a=customers[i][0];
            start=Math.max(a,start);
            int t=customers[i][1];
            total+=(start+t)-a;
            start+=t;
        }
        return total/customers.length;
    }
}
