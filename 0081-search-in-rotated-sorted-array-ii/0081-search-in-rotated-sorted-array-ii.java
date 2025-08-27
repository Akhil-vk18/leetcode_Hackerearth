class Solution {
    // 0(log n)
    public boolean search(int[] nums, int target) {
       return binarySearch(nums,target,0,nums.length-1);
    }

    private boolean binarySearch(int[] nums, int target,int low,int high) {
        if (low > high ) {
            return false;
        }
        int mid = low + (high - low) / 2;
        
        if (nums[mid] == target) {
            return true;
        }
        //if values at low ,mid,high are same shrink the array
        if (nums[low]==nums[mid]&&nums[mid]==nums[high]) {
            return binarySearch(nums, target, low+1, high-1);
        }
        //left sorted 
         if (nums[mid] >=nums[low]) {
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