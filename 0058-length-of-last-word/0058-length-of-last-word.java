class Solution {
    public int lengthOfLastWord(String s) {
        int length=0,l=s.length()-1,space=0;
        if(l<0)
            return 0;
        while(s.charAt(l)==' '){
            l--;
        }
        while(space<1&&l>=0){
            if(s.charAt(l)==' '){
                space++;
            }
            else{
                length++;
            }
            l--;
        }
        return length;
    }
}