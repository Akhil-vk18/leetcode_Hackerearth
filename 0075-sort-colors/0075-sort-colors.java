class Solution {
    public void sortColors(int[] nums) {
        int start, middle, end;
        start = middle = 0;
        end = nums.length - 1;
        while (middle <= end) {
            if (nums[middle] == 0) {
                nums[middle++] = nums[start];
                nums[start++] = 0;
               
            }
             else if (nums[middle] ==1 ) {
                middle++;
            }
          else {
                nums[middle] = nums[end];
                nums[end--] = 2;
              
            }

        }
    }
}