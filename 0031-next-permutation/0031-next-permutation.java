class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = nums.length - 2;
        int length =nums.length;
        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }
        if (pivot >= 0) {
            int pi = length - 1;
            while (nums[pivot] >= nums[pi]) {
                pi--;
            }
            swap(pi, pivot, nums);
        }
        reverse(pivot + 1,length-1 ,nums);
        
    }
    public void swap(int pi, int pj, int[] nums) {
        int temp = nums[pi];
        nums[pi] = nums[pj];
        nums[pj] = temp;
    }
    public void reverse(int start, int end ,int[] nums) {
        while (start < end) {
            swap(start, end, nums);
            start++;
            end--;
        }
    }
}