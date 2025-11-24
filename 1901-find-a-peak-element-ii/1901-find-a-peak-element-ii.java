class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int low=0,high=cols-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            int maxrow=findMax(mat, mid);
            int left=(mid-1>=0)?mat[maxrow][mid-1] :-1;
            int right=(mid+1<cols)?mat[maxrow][mid+1] : -1;
            if (mat[maxrow][mid]>right&&mat[maxrow][mid]>left ){
                return new int[]{maxrow,mid};
            } else if(right>mat[maxrow][mid]){
                low=mid+1;
            }else{
            high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public int findMax(int[][] mat, int col) {
        int row=mat.length;
        int max=Integer.MIN_VALUE;
        int maxrow=-1;
        for (int idx = 0; idx < row; idx++) {
            if(max<mat[idx][col]){
                max=mat[idx][col];
                maxrow=idx;
            }  
        }
        return maxrow;
    }
}