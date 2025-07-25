class Solution {
    public int climbStairs(int n) {
        int[] a=new int[n+1];

        return fibo(n,a);
    }
    private int fibo(int n, int[] a){
                if(n==1||n==0)
            return 1;
            if(a[n]!=0) return a[n];
        a[n]= (fibo(n-1,a)+fibo(n-2,a));
        return a[n];
    }
}