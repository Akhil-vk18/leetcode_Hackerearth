class Solution {
    public int maxProduct(int[] nums) {
         int maxpro =Integer.MIN_VALUE,length =nums.length;
      for(int i=0;i<length;i++){
        int cpro=1;
        for(int j=i;j<length;j++){
            cpro=cpro*nums[j];
            
            maxpro=Math.max(maxpro, cpro);
        }
      }
    //   System.out.println(maxpro);
        return maxpro;
    }
}