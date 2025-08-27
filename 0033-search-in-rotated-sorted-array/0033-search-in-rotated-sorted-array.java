class Solution {
    // 0(log n)
    public int search(int[] nums, int target) {
       return binarySearch(nums,target,0,nums.length-1);
    }

    private int binarySearch(int[] nums, int target,int low,int high) {
        if (low > high ) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        //left sorted 
         else if (nums[mid] >=nums[low]) {
            if (target>=nums[low] && target<nums[mid]) {
                return binarySearch(nums, target, low, mid - 1);
            }else{
                return binarySearch(nums, target, mid + 1, high);
            }
           
        }
        //right sorted
         else {
             if (target > nums[mid] && target <= nums[high]) {
                 return binarySearch(nums, target, mid+1, high);
             } else {
                 return binarySearch(nums, target, low, mid-1);
             }
           
        }
    }


}