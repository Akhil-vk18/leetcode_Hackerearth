class Solution {
    public int maxDepth(String s) {
          int len = s.length();
        int maxCount = 0;
        int counter = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                counter++;
            } else if (ch == ')') {
                counter--;
            }
            maxCount = Math.max(counter, maxCount);
        }
        return maxCount;  
    }
}