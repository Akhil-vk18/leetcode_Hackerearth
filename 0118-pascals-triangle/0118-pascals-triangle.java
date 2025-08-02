class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        List<List<Integer>> res =new ArrayList<>();
         res.add(new ArrayList<>(List.of(1)));
        
        for(int i =1;i<=numRows-1;i++){
           
             List<Integer> prevlist =res.get(i-1);
            List<Integer> inlist =new  ArrayList<>();
            inlist.add(0,1);
          
            for(int j=1;j<=i-1;j++){
                int value = prevlist.get(j-1) + prevlist.get(j);
                inlist.add(value);
            }
              inlist.add(1);
    res.add(inlist);
        }
        return res;
    }
}