class Solution {
    public String removeOuterParentheses(String s) {
       StringBuffer st = new StringBuffer();
       int open =0;
       int i=0,length=s.length();
       while (i<length) {
        if (s.charAt(i)=='(') {
            if (open>0) {
                st.append(s.charAt(i));
            }
            open++;
        }
        if(s.charAt(i)==')'){
            open--;
            if (open > 0) {
                st.append(s.charAt(i));
            }
        }
        i++;
       }
       return st.toString();
    }
}