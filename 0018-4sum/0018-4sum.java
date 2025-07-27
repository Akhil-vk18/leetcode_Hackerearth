class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> quad = new HashSet<>();
        Arrays.sort(nums);
        int j, l, r;
        long sum ;
        for (int i = 0; i < nums.length - 3; i++) {
            for (j = i + 1; j < nums.length - 2; j++) {
                l = j + 1;
                r = nums.length - 1;
                sum = 0;
                while (l < r) {
                    sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        quad.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                    }
                    if (sum < target)
                        l++;
                    if(sum>target)
                        r--;
                }

            }
        }
        return new ArrayList<>(quad);
    }
}