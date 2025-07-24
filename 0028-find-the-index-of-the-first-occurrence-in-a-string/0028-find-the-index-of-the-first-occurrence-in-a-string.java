class Solution {
    public int strStr(String haystack, String needle) {
        // return(haystack.indexOf(needle));
        int h = haystack.length(), n = needle.length(), index = -1, l = 0, m = 0, j;
        // boolean occurance=flase;
        while (l <= h - n) {
            m = 0;
            if (haystack.charAt(l) == needle.charAt(0)) {
                index = l;
                j = l + 1;
                while (j < l + n) {
                    m++;
                    if (haystack.charAt(j) != needle.charAt(m)) {
                        index = -1;
                        break;
                    }
                    j++;
                }
                if (index != -1) {
                    return index;
                }
            }

            l++;
        }
        return index;
    }
}