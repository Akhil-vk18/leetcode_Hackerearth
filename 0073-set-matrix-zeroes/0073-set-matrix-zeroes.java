class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashMap<Integer, int[]> zeros = new HashMap<>();
        int zero_i = 0;
        ;
        int[] pos = new int[2];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                 
                    zeros.put(++zero_i, new int[]{i,j});
                }
            }

        for (Integer key : zeros.keySet()) {
            pos = zeros.get(key);
            for (int i = 0; i < rows; i++) {
                matrix[i][pos[1]] = 0;
            }
            for (int i = 0; i < cols; i++) {
                matrix[pos[0]][i] = 0;
            }
        }
    }
}