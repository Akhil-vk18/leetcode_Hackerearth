class Solution {
     public int[] searchRange(int[] nums, int target) {
        
        int low =0, high = nums.length-1;
        int start =findStart(nums,low,high,target);
        int end =findEnd(nums,low,high,target);
        if (start>high || nums[start]!=target) {
            return new int[] { -1, -1 };
        }
        return new int[] { start, end };
    }

 public int findStart(int[] nums,int low,int high,int target){
        int mid;
    while (low<=high) {
        mid = low+(high-low)/2;
           if (nums[mid]>=target) {
            high =mid-1;
           } else {
            low=mid+1;
           }
        }
        return low;
    }
    
    public int findEnd(int[] nums,int low,int high,int target){
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}