class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> triplets =new HashSet<>();
       Arrays.sort(nums);
       int l,r,sum;
       for(int i=0;i<nums.length-2;i++){
        l =i+1;
        sum=0;
        r=nums.length-1;
        while(l<r){
            sum=nums[i]+nums[l]+nums[r];
            if(sum==0){
                triplets.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;r--;
            }
            if(sum<0)
                l++;
            if(sum>0)
            r--;
        }
        
       }
       return new ArrayList<>(triplets);
    }
}