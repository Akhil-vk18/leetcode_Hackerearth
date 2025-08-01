class Solution {
    public int reverse(int x) {
        int rev = 0;
        int sign = (x < 0) ? -1 : 1;
        x = x * sign;
        while (x > 0) {
            // if ((rev * 10 ) > Integer.MAX_VALUE - 1 || (rev * 10) < Integer.MIN_VALUE)   if check like this rev*10 will be wrapped inside the MAX value so check the rev first;
            if(rev>(Integer.MAX_VALUE - 1)/10)
                return 0;
            rev = rev * 10 + x % 10;

            x = x / 10;
        }
        return rev * sign;
    }
}