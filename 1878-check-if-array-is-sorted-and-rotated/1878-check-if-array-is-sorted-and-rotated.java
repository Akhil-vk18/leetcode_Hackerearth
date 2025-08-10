class Solution {
    public boolean check(int[] nums) {
        //original sorted array
        int[] a = nums.clone();
        Arrays.sort(a);
        int x = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == nums[0]) {
                x = i;
                for (int j = 0; j < a.length; j++) {
                    if (nums[j] != a[(j + x) % a.length]){
                        x = -1;
                    break;
                    }
                }
                if (x != -1)
                    return true;

            }
        }
     return false;  
    }
}