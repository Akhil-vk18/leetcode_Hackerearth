class Solution {
    public String reverseWords(String s) {
       StringBuffer result =new  StringBuffer();
        int len = s.length();
        // System.out.println(len);
        int i=0;
        char c;
        StringBuffer word =new StringBuffer();
        while (i<len) {
            c = s.charAt(i);
            // System.out.println(c);
            if (c!=' ') {
                word.append(c);
               
            }else if(word.length()>0){
                if (result.length()>0 ) {
                    result.insert(0, word +" ");
                }else{
                    result.append(word);
                }
                // System.out.println(word);
                word.setLength(0);
            }
            i++;
        }
        if(word.length()>0){
            if (result.length() > 0) {
                result.insert(0, word + " ");
            } else {
                result.append(word);
            }
        }
        
        
        return  result.toString();
    }
}