class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int length = s.length();
        // int[] values = new int[length];
        int value = 0;
        //    int i=0;
        // for (int i = 0; i < length; i++) {
        //     char ch = s.charAt(i);
        //     value += romanValues.get(ch);
        // }
        int i = 0;
        while (i <= length - 1) {
            //  char ch = ;
            // value += romanValues.get(s.charAt(i));
            if (i != length - 1) {
                if (romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
                    value += romanValues.get(s.charAt(i + 1)) - romanValues.get(s.charAt(i));
                    i += 2;
                } else {
                    value += romanValues.get(s.charAt(i));
                    i++;
                }
            } else {
                value += romanValues.get(s.charAt(i));
                i++;
            }

        }
        return value;

    }
}