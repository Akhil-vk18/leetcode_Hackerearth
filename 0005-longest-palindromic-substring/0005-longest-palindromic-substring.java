class Solution {
    public String longestPalindrome(String s) {
        int[][] length = new int[s.length()][s.length()];
        int n = s.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            length[i][i] = 1;
            result = s.substring(i, i + 1);
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                length[i][i + 1] = 2;
                result = s.substring(i, i + 2);
            }
        }
        for (int len = 3; len <= n; len++)
            for (int i = 0; len - 1 + i < n; i++) {
                int j = len - 1 + i;
                if (s.charAt(i) == s.charAt(j) && length[i + 1][j - 1] != 0) {
                    length[i][j] = 2 + length[i + 1][j - 1];
                    if (result.length() < length[i][j]) {
                        result = s.substring(i, j + 1);
                    }
                }
            }
        return result;
    }
}