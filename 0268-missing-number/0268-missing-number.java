class Solution {
    public int missingNumber(int[] nums) {
       
       int sum=0,n=nums.length;
        for (int i : nums) {
            sum +=i;
        }
        //sum of sequence is n(n+1)/2
       //so we can find the expected sum using this formula. 
       // difference in expected and sum of array is the missing number.
        return n*(n+1)/2-sum;
    }
}