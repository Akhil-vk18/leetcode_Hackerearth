class Solution {
    public int findDuplicate(int[] nums) {
 HashSet<Integer> visited =new HashSet<>();
 for(int i=0;i<nums.length;i++){
    if(!visited.add(nums[i]))
  return nums[i];
 }

 return -1;
    }
}