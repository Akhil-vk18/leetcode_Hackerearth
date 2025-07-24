class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            //if digit is 9 then we make it 0 and loop continues till an digit less than 9 is found
            digits[i] = 0;
            i--;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}