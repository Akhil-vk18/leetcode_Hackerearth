class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length()) {
            return false;
        }
        StringBuffer sb =new StringBuffer(s);
        int length =s.length();
        for (int i = 0; i < length; i++) {
            String first = sb.substring(0,1);
            sb.delete(0, 1);
            sb.append(first);
            if (goal.equals(sb.toString())) {
                return true;
            }
        }
    return false;
    }
}