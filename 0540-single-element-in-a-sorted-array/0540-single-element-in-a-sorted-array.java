class Solution {
    public int singleNonDuplicate(int[] nums) {
        
       if (nums.length==1) {
        return nums[0];
       }
       if (nums[0] != nums[1]) {
           return nums[0];
       }
       if (nums[nums.length-1]!=nums[nums.length-2]) {
        return nums[nums.length-1];
       }
       int low = 1, high = nums.length - 2;
        while (low<=high) {
            int mid =low+(high-low)/2;
        //  System.out.println("low "+ nums[low] + " high " + nums[high]);
            if (nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]) {
                return nums[mid];
            }
           
            else if (mid%2==0) {
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
       return nums[low];
    }
}