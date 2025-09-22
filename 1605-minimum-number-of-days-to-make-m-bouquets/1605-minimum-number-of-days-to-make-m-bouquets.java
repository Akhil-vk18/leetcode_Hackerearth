class Solution {
   public  int minDays(int[] bloomDay, int m, int k) {// m = no:of bouquets , k= no:of adjacent flowers
        if ((long)bloomDay.length<(long)m*k) {
            return -1;
        }
       
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : bloomDay) {
            min= Math.min(i, min);
            max =Math.max(i, max);
        }
        while (min<=max) {
            int mid = min +(max-min)/2;
            if (isPossible(bloomDay,mid,m, k)) {
                max = mid -1;
            }
            else{
                min = mid +1;
            }
        }
        return min;

    }
    public  boolean isPossible( int[] bloomDay , int day ,int m , int k){
        int count =0;int bouquets =0;
       
        for (int i : bloomDay) {
            if (i<=day) {
                count++;
            }
            else{
                bouquets += count/k ;
                count=0;
            }
        }
        bouquets += count /k;
       
        return bouquets>=m ;
    }
}