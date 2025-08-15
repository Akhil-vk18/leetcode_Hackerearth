class Solution {
    public int missingNumber(int[] nums) {
       
        boolean[] missing = new boolean[nums.length +1];
        for (int i : nums) {
            missing[i] = true;
        }
        for (int i = 0; i <missing.length; i++) {
            if (!missing[i]) {
                return i;
            }
        }
        return -1;
    }
}