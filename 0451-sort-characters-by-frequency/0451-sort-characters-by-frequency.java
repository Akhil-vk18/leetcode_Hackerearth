class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freqHashMap = new HashMap<>();
       StringBuilder result = new StringBuilder();
        for (int idx = 0; idx < s.length(); idx++) {
            freqHashMap.put(s.charAt(idx), freqHashMap.getOrDefault(s.charAt(idx), 0) +1);
            // converting into arraylist for sorting
           
        }
        List<Map.Entry<Character, Integer>> entrylist = new ArrayList<>(freqHashMap.entrySet());
        entrylist.sort(Comparator.comparing(Map.Entry<Character, Integer>::getValue).reversed());
        for (Map.Entry<Character, Integer> entry : entrylist) {
            int Frequency = entry.getValue();
            char ch = entry.getKey();
            for (int i = 0; i < Frequency; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}