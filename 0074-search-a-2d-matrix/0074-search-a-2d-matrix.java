class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int elements : row) {
                if (elements==target) {
                    return  true;
                }
            }
        }
        return false;
    }
}