class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int index=cols-1;
        int[][] temp=new int[cols][rows];
        for(int i=0;i<rows;i++){
             index=cols-1;
            for(int j=0;j<cols;j++){
               temp[i][j]=matrix[index][i];
               index--;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               matrix[i][j]=temp[i][j];
            }
        }
        
       
    }
}