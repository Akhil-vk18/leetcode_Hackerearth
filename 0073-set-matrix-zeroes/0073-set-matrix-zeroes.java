class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean row = false;
        boolean col = false;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        row = true;
                    if (j == 0)
                        col = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }

        for (int i = 1; i < rows; i++)
            for (int j = 1; j < cols; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }

        if(row){
            for(int i=0;i<cols;i++)
                matrix[0][i]=0;
        }
          if(col){
            for(int i=0;i<rows;i++)
                matrix[i][0]=0;
        }
    }
}