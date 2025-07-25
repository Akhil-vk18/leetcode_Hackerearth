class Solution {
    public String addBinary(String a, String b) {
        int carry = 0, sum = 0, bit;
        StringBuilder sb = new StringBuilder();
        int al = a.length() - 1, bl = b.length() - 1;
        while (al >= 0 || bl >= 0 || carry == 1) {
            sum = 0;
            if (carry == 1)
                sum += carry;
            if (al >= 0) {
                bit = Integer.parseInt(String.valueOf(a.charAt(al--)));
                sum += bit;
            }
            if (bl >= 0) {
                bit = Integer.parseInt(String.valueOf(b.charAt(bl--)));
                sum += bit;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}