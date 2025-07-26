class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l, r, sum,closest=nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            l = i + 1;
            sum = 0;
            r = nums.length - 1;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if(sum==target) return target;
                if (Math.abs(sum-target)<Math.abs(closest-target)) {
                    closest=sum;
               
                }
                if (sum < target)
                    l++;
                if (sum > target)
                    r--;
            }

        }
        return closest;
    }
    
}