class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Stack<Character> st = new Stack<>();
        boolean valid = true;
        while (i < s.length()) {
            char br = s.charAt(i);
            switch (br) {
                case '(':
                    st.push(')');
                    break;
                case '{':
                    st.push('}');
                    break;
                case '[':
                    st.push(']');
                    break;
                default:
                    if (st.isEmpty()||br != st.pop()) {
                       
                        return false;
                    }

            }
            i++;
        }
        if(valid&&!st.isEmpty()){
            return false;
        }
        return valid;
    }

}