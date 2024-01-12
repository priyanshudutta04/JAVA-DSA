// Given an array nums with n objects colored red, white, or blue, sort them in-place so 
// that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


// Runtime: 2ms      Memory:41.97MB

 

class sortColor {

    static int partition(int[] arr, int st, int end){      
        int pivot = arr[st];
        int cnt = 0;     
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;

        int temp = arr[st];
        arr[st] = arr[pivotIdx];
        arr[pivotIdx] = temp;     
        int i = st, j = end;
            
        while(i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quick(int[] arr, int st, int end){
        if(st >= end) return;
        int p = partition(arr, st, end);
        quick(arr, st, p-1);
        quick(arr, p+1, end);
    }
    public void sortColors(int[] nums) {
        quick(nums, 0, nums.length-1);
    }
}