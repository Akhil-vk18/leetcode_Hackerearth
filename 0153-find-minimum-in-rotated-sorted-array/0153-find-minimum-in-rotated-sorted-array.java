class Solution {
    public int findMin(int[] nums) {
       int low =0, high =nums.length-1;
        while (low<high) {
            int mid=low+(high-low)/2;
           if(nums[mid]<nums[high]){//mid value will always be less than high value beacuse of accending order
            high=mid;
           }
           else{
            low=mid+1;
           }
           
        }
        return nums[low];
    }
}