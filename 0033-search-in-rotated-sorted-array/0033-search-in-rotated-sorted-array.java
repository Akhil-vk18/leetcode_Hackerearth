class Solution {
    public int search(int[] nums, int target) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] < nums[i]) {
            i--;
        }
        int index = binarySearch(nums, target, 0, i - 1);//lower bound
        if (index == -1) {
            index = binarySearch(nums, target, i, nums.length-1);//upper bound
        }

        System.out.println(index);
        return index;
        // binarySearch(nums,target,i+1,nums.length);
    }

    private int binarySearch(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, low, mid - 1);
        } else {
            return binarySearch(nums, target, mid + 1, high);
        }
    }

}