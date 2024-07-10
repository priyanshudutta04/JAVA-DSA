// 1598. Crawler Log Folder


// The Leetcode file system keeps a log each time some user performs a change folder operation.

// The operations are described below:

// "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
// "./" : Remain in the same folder.
// "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
// You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.

// The file system starts in the main folder, then the operations in logs are performed.

// Return the minimum number of operations needed to go back to the main folder after the change folder operations.



// Runtime: 1ms      Memory:41.79MB


class Solution {
    public int minOperations(String[] logs) {
        int steps=0;
        for(String i: logs){
            if(i.equals("../")){
                if(steps>0)
                    steps-=1;
            }          
            else if(i.equals("./"))
                continue;
            else
                steps+=1;
        }
        return steps;
    }
}
