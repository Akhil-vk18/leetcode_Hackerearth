class Solution {
    public  int smallestDivisor(int[] nums, int threshold) {
        int low =1 ,high =0;
        for (int i : nums) {
            high=Math.max(i, high);
        }
        // System.err.println("max "+high);
        while (low<=high) {
            int mid =low + (high-low)/2;
            // int sum=resultSum(nums,mid);
            if(resultSum(nums,mid)<=threshold){//possible
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        // System.err.println("smallest divisor "+ low);
        return low;
    }
    public  int resultSum(int[] nums ,int divisor){
        int sum =0;
        for (int i : nums) {
            // sum += Math.ceil((double)i/divisor);
            sum+= (i+divisor-1)/divisor;
        }
        // System.err.println("divisor "+divisor);
        // System.out.println("sum " +sum);
        return sum;
    }
}