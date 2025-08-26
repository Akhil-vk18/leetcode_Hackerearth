class Solution {
    public int search(int[] nums, int target) {

        return binarySearch(nums, 0, nums.length-1,target);
        
    }
    public int binarySearch(int[] nums,int low,int high,int target){
        if (low>high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        }else if(target<nums[mid]){
            return binarySearch(nums, low, mid-1, target);
        }
        else{
            return binarySearch(nums, mid+1, high, target);
        }
        
        // int low = 0, high = nums.length - 1;
        // while (low <= high) {
        // int mid = low + (high - low) / 2;
        // if (nums[mid] == target) {
        // return mid;
        // }
        // if (target<nums[mid]) {
        // high=mid-1;
        // }else
        // low=mid+1;
        // }

        // return -1;
    }

}