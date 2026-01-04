class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> iso_s =new HashMap<>();
        HashMap<Character, Character> iso_t = new HashMap<>();
        StringBuilder sb_s = new StringBuilder();
        StringBuilder sb_t =new StringBuilder();
        for(int i =0; i<s.length();i++  ){
            iso_s.put(s.charAt(i), t.charAt(i));
                iso_t.put(t.charAt(i),s.charAt(i));
        }
       for (int i = 0; i < s.length(); i++) {
           
           sb_t.append(iso_s.get(s.charAt(i)));
           sb_s.append(iso_t.get(t.charAt(i)));
       }
       return t.equals(sb_t.toString()) && s.equals(sb_s.toString());
    }
}