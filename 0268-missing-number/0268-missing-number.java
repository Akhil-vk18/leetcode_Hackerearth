class Solution {
    public int missingNumber(int[] nums) {
       int num=nums.length;
        boolean[] missing = new boolean[nums.length +1];
        for (int i : nums) {
            missing[i] = true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!missing[i]) {
                num=i;
            }
        }
        return num;
    }
}