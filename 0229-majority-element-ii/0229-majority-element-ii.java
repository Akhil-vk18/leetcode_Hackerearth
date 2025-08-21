class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        System.err.println(count);
        for (int key : count.keySet()) {
            if (count.get(key)>nums.length/3) {
                result.add(key);
            }
        }
        System.out.println(result);
        return result;
    }
}