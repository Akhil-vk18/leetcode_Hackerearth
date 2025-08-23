class Solution {
    public int maxProduct(int[] nums) {
        int maxpro = Integer.MIN_VALUE, length = nums.length, leftPro = 1, rightPro = 1;
        for (int i = 0; i < length; i++) {
            if (leftPro == 0) {
                leftPro = 1;
            }
            if (rightPro == 0) {
                rightPro = 1;
            }
            leftPro = nums[i] * leftPro;
            rightPro = nums[length - 1 - i] * rightPro;
            maxpro = Math.max(maxpro, Math.max(leftPro, rightPro));
        }
        //   System.out.println(maxpro);
        return maxpro;
    }
}