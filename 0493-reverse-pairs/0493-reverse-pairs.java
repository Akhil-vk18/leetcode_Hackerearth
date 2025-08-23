class Solution {
    public int reversePairs(int[] nums) {

        return mergesort(0, nums.length - 1, nums);
    }

    public int mergesort(int low, int high, int[] nums) {
        int count = 0;
        if (low >= high) {
            return count;
        } else {
            int mid = low + (high - low) / 2;
            count = count + mergesort(low, mid, nums);
            count = count + mergesort(mid + 1, high, nums);
            count = count + countpairs(low, mid, high, nums);
            merge(low, mid, high, nums);
        }
        return count;

    }

    public void merge(int low, int mid, int high, int[] nums) {
        int left = low, right = mid + 1;
        List<Integer> arr = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                arr.add(nums[left++]);
            } else {
                arr.add(nums[right++]);
            }
        }
        while (left <= mid) {
            arr.add(nums[left++]);
        }

        while (right <= high) {
            arr.add(nums[right++]);
        }
        int i = low;
        while (i <= high) {
            nums[i] = arr.get(i - low);
            i++;
        }
    }

    public int countpairs(int low, int mid, int high, int[] nums) {
        int right = mid + 1;
        int count = 0;
        for (int left = low; left <= mid; left++) {
            while (right <= high && (long) nums[left] > 2L * nums[right]) {
                right++;
            }
            count += right - (mid + 1);
        }
        return count;
    }
}