class Solution {
    public void moveZeroes(int[] nums) {
        int length =nums.length;
       
        int nonzero= 0;
        for(int i=0;i<length;i++){
            if(nums[i]!=0){
                nums[nonzero++]=nums[i];
             
            }
        }
        for(int i=nonzero;i<length;i++){
            nums[i]=0;
        }
        
    }
}