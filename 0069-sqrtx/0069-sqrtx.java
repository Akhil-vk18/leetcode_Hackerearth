class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        return sqrt(1, x, x);

    }

    private int sqrt(long left, long right, long sqr) {
        if (left > right)
            return (int)right;
        long mid = (left + right) / 2;
        if (mid * mid == sqr)
            return (int)mid;
        else if (mid * mid > sqr)
            return sqrt(left, mid - 1, sqr);
        else
            return sqrt(mid + 1, right, sqr);
    }
}