class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] trans=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        int ti=cols-1;
        
         for(int i=0;i<rows;i++){
             ti=cols-1;
            for(int j=0;j<cols;j++){
                matrix[i][j]=trans[i][ti];
                ti--;
            }
        }
       
    }
}