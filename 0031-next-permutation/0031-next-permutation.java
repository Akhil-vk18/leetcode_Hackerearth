class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = nums.length - 2;
        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }
        //if pivot is -1 then all elements are in increasing order , so we need to return the loweest possinble order eg: for[3,2,1] we return [1,2,3]
        if (pivot >= 0) {
            //we need to find the first elment which is greater than the pivot element. then we swap them
            int pi = nums.length - 1;
            while (pi >= 0 && nums[pivot] >= nums[pi]) {
                pi--;
            }
            //swap the numbers
            swap(pi, pivot, nums);
        }
        reverse(pivot + 1, nums);
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int pi, int pj, int[] nums) {

        int temp = nums[pi];
        nums[pi] = nums[pj];
        nums[pj] = temp;

    }

    public void reverse(int start, int[] nums) {
        int end = nums.length - 1;
        while (start < end) {
            swap(start, end, nums);
            start++;
            end--;
        }
    }
}