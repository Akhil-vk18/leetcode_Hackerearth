class Solution {
    // using binary search 
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols=matrix[0].length;
        int low =0; 
        
        int high = matrix.length*cols -1;
        while (low <=  high) {
            int mid =(low+high)/2;
            int row = mid/cols; //getting row number    
            int col = mid%cols;// getting col number 
            if (target==matrix[row][col]) {
                return  true;
            }else if (matrix[row][col]<target) {
                low =mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return  false;
    }
}