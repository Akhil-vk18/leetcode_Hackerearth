class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int n=s.length();
        if(n==0||n==1){
            return n;
        }
        boolean[] vis =new boolean[256];
        int left=0;
        int right =0;
        
        int maxlength=1;
        while(right<n){
            while(vis[s.charAt(right)]==true){
              vis[s.charAt(left)]=false;
              left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
            vis[s.charAt(right)]=true;
            right++;
        }
        return maxlength;

    }
}