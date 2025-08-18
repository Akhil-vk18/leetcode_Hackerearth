class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> occurence =new HashMap<>();
        int length =nums.length;
        for (int i : nums) {
            occurence.put(i,occurence.getOrDefault(i, 0)+1);
        }
        for (int key : occurence.keySet()) {
            if (occurence.get(key)>length/2) {
                return key;
            }
        }

        return -1;
    }
}