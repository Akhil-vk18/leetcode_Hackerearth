class Solution {
    public int myAtoi(String s) {
        int index=0,l=s.length(), sign =1;
        long result=0;
        while(index<l&&s.charAt(index)==' '){
            index++;
        }
        if(index<l && (s.charAt(index)=='+'||s.charAt(index)=='-')){
           sign= (s.charAt(index)=='+')? 1 : -1 ;
            index ++;
        }
        while(index < l && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index)-'0';
            result = result*10 + digit;
          
        if (result > Math.pow(2,31)-1){
            if (sign ==-1 )
             return Integer.MIN_VALUE;
             else {
         return Integer.MAX_VALUE;
        }
        }
            index ++;
        
        }
    return (int)result*sign;

    }
}