// Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

// According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h 
// papers that have each been cited at least h times.


// Runtime: 2ms      Memory:41.78MB


import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[n - i - 1];
            citations[n- i - 1] = temp;
        }
       
        int c=0;

        for(int i=0;i<n;i++){
           
            if(citations[i]>=i+1)
                c++;
        }
        return c;
    }
}
