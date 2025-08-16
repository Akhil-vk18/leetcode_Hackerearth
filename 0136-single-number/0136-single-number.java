class Solution {
    public int singleNumber(int[] nums) {
        int xor =00;
      for (int i : nums) {
        xor =xor^i;
      }
    return xor;
    }
}