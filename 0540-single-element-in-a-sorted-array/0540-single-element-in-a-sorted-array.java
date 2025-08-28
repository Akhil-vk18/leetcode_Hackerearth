class Solution {
     public int singleNonDuplicate(int[] nums) {
      if (nums.length==1) {
        return nums[0];
      }
       int low = 0, high = nums.length - 2;
       int mid=0;
        while (low<=high) {
             mid =low+(high-low)/2;
        //  System.out.println("low "+ nums[low] + " mid "+ nums[mid]+ " high " + nums[high]);
            // if (nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]) {
            //     return nums[mid];
            // }
           
             if (mid%2==0) {
                // if elements in even and odd  indexes are same  , then element is in  right half else in the left half 
                if (nums[mid]==nums[mid+1]) {
                    low=mid +1;
                }
                else{
                    high = mid -1;
                }
            }
            else{
                // check if odd even , then element is in left half else in the  right half
                if (nums[mid]==nums[mid+1]) {
                    high =mid-1;
                }
                else{
                    low =mid+1;
                }
            }
        }
        // System.out.println("low " + nums[low] + " mid " + nums[mid] + " high " + nums[high]);
       return nums[low];
    }
}