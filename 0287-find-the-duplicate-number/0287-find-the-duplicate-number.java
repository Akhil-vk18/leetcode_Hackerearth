class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
       int repeat=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
             repeat=nums[i];
        }
        return repeat;
    }
}