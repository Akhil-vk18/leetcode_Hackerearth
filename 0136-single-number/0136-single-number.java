class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer ,Integer> occurence =new HashMap<>();
       for (int i : nums) {
        occurence.put(i, occurence.getOrDefault(i,0)+1);
       }
       System.out.println(occurence);
    for (int key : occurence.keySet()) {
        if(occurence.get(key)==1){
            return key;
        }
        
    }
    return-1;
    }
}