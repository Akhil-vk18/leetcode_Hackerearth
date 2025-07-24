class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];//no changee will happen to the current right value . current value of right is moved to left.
            }
        }
        return left + 1;
    }
}