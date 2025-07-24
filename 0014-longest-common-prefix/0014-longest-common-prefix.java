class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int index = 0;
        String prefix = "";
    
        while (index < s.length()) {
            char ch = s.charAt(index);
            boolean allmatch=true;
            for (String str : strs) {
                
                    if (index >=str.length() || ch != str.charAt(index)) {
                        allmatch=false;
                        break;
                    }
                

            }
            if (allmatch) {
                prefix += ch;
               
            }
            else{
                break;
            }
            index++;
        }
        return prefix;
    }
}