class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result=new int[nums.length];
        int pi=0,ni=1;
        for (int i : nums) {
            // System.out.println(i);
            if (i>0) {
                result[pi]=i;
               
                pi=pi+2;
            } 
            else{
                result[ni]=i;
               
                ni=ni+2;
            }
        }
    //   System.out.println(Arrays.toString(result));
        return result;
    }
}