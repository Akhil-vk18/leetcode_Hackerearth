class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        List<List<Integer>> res =new ArrayList<>();
         res.add(new ArrayList<>(List.of(1)));
        if(numRows==1){
        return res;
        }
        int index=0;
        
        for(int i =1;i<=numRows-1;i++){
            index=0;
             List<Integer> prevlist =res.get(i-1);
            List<Integer> inlist =new  ArrayList<>();
            inlist.add(0,1);
          
            for(int j=1;j<=i-1;j++){
                int value = prevlist.get(index) + prevlist.get(index+1);
                inlist.add(j,value);index++;
            }
              inlist.add(1);
    res.add(inlist);
        }
        return res;
    }
}