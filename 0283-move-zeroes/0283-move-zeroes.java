class Solution {
    public void moveZeroes(int[] nums) {
        int length =nums.length;
       
        int nonzero= 0;
        for(int i=0;i<length;i++){
            if(nums[i]!=0){
                int temp =nums[nonzero];
                nums[nonzero++]=nums[i];
                nums[i]=temp;
             
            }
        }
        // for(int i=nonzero;i<length;i++){
        //     nums[i]=0;
        // }
        
    }
}