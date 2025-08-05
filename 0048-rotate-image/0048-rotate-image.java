class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
               
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
        int ti = n - 1;

        for (int i = 0; i < n; i++) {
            ti = n - 1;
            for (int j = 0; j < n/2; j++) {
               
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][ti];
                matrix[i][ti--] = temp;
            }
        }

    }
}