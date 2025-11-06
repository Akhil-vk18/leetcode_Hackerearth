class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for (int i : nums) {
            low=Math.max(low, i);
            high+=i;
        }

        while (low<=high) {
            int mid=low+(high-low)/2;
            if (canslipt(nums,k,mid)) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean canslipt(int nums[],int k, int maxsum){
        int arraycount=1,currentsum=0;
        for (int i : nums) {
            if (currentsum+i>maxsum) {
                arraycount++;
                currentsum=i;
            }else{
                currentsum+=i;
            }
        }
        return (arraycount<=k);
    }
    
}