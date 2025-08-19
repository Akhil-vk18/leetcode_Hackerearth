class Solution {
    public int maxSubArray(int[] nums) {
             //using kadane's algorithm
        int csum = 0, sum = Integer.MIN_VALUE;
        for (int i : nums) {
            csum=Math.max(csum+i,i);
            sum=Math.max(csum, sum);
        }
        return sum;
    }
}