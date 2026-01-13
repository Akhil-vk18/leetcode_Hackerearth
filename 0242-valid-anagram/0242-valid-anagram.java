class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
       HashMap<Character, Integer> occurance_s = new HashMap();
              HashMap<Character, Integer> occurance_t = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            occurance_s.put(s.charAt(i), occurance_s.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            occurance_t.put(t.charAt(i), occurance_t.getOrDefault(t.charAt(i), 0) + 1);
        }
        return occurance_s.equals(occurance_t);
    }
}