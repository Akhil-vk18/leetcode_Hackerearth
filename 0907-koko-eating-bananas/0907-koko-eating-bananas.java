class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxspeed = 0;
        for (int i : piles) {
            if (maxspeed <= i) {
                maxspeed = i;
            }
        }
        // System.out.println(maxspeed);
        while (minspeed <= maxspeed) {
            int mid = minspeed + (maxspeed - minspeed) / 2;
            // System.out.println("minspeed k: " + minspeed);
            int completionTime = findSpeed(piles, mid);

            // if (completionTime == h) {
            //     return mid; // less than mid is possible as minspeed
            // } else
             if (completionTime <= h) {
                maxspeed = mid - 1;
            } else {
                minspeed = mid + 1;
            }
        }
        return minspeed;
    }

    public int findSpeed(int[] piles, int eatingspeed) {

        int time = 0;
        for (int i : piles) {
            time += Math.ceil((double) i / eatingspeed);// if typecast is not done, integer division will takes place 
                                                        //so  we  will not get the correct ceiling value;
        }
        // System.out.println("time " + time);
        return time;

    }

}