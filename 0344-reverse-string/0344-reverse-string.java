class Solution {
     public void reverseString(char[] s) {
       int length= s.length;
        for(int start=0,end=length-1;start<end;start++,end--){
            swap(start,end,s);
        }
    }
    public void swap(int start,int end,char[] s){
        char ch = s[start];
        s[start]=s[end];
        s[end]=ch;
    }
}