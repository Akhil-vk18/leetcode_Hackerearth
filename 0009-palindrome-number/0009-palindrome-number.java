class Solution {
    public boolean isPalindrome(int x) {
        String copy=String.valueOf(x);
      int length = copy.length();
      
      for(int left =0,right=length-1;left<=right;left++,right--){
        if(copy.charAt(left)!=copy.charAt(right))
        return false;
      }
      return true;
    }
}