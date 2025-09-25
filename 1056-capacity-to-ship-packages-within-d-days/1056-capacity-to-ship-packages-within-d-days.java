class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =Integer.MIN_VALUE,high =0;
        for (int i : weights) {
            low =Math.max(i, low);
            high +=i;
        }

        // System.err.println("low :"+low+"\n high :" +high);
        while (low<=high) {
            int mid=low+(high-low)/2;
            // System.err.println("low "+low);
            if (canShip(weights, days, mid)) {// returns boolean
                //check for minimum
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return low;
        
    }
    public boolean canShip(int[] weights , int days,int capacity){
        // int total_weight=0;
        // for ( int i : weights) {
        //     total_weight += i;
        // }
        // System.err.println("helper func");
      int  days_needed =1,current_weight_to_ship=0;
        for (int weight : weights) {
            if (current_weight_to_ship+weight>capacity) {
                days_needed++;
                current_weight_to_ship=weight;
            }
            else{
                current_weight_to_ship+=weight;
            }
        }
        return(days_needed<=days);
    }
}