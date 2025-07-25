class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        return sqrt(1, x, x);

    }

    private int sqrt(int left, int right, int sqr) {
        if (left > right)
            return right;
        int mid = left + (right - left) / 2;

        long sqaure = (long) mid * mid;
        if (sqaure == sqr)
            return mid;
        else if (sqaure > sqr)
            return sqrt(left, mid - 1, sqr);
        else
            return sqrt(mid + 1, right, sqr);
    }
}