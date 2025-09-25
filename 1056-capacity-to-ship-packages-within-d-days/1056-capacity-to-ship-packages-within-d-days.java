class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =Integer.MAX_VALUE,high =0;
        for (int i : weights) {
            low =Math.min(i, low);
            high +=i;
        }
        int total_weight=high;
        // System.err.println("low :"+low+"\n high :" +high);
        while (low<=high) {
            int mid=low+(high-low)/2;
            // System.err.println("low "+low);
            if (canShip(weights, days, mid,total_weight)) {// returns boolean
                //check for minimum
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return low;
        
    }
    public boolean canShip(int[] weights , int days,int capacity,int total_weight){
        // int total_weight=0;
        // for ( int i : weights) {
        //     total_weight += i;
        // }
        // System.err.println("helper func");
        int i=1,package_no=0,delivered=0;
        while (i<=days) {
            int weight=0;
            while (package_no<weights.length&&(weight+weights[package_no])<=capacity) {
                weight+=weights[package_no];
                package_no++;
            }
            delivered += weight;i++;
        }

        return(delivered==total_weight);
    }
}