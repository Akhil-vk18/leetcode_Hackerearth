import java.util.ArrayList;
import java.util.List;

public class Solution {
   public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length;
        int top=0,bottom=rows-1;
        int left=0,right=cols-1;
    List<Integer> result =new ArrayList<>();
        //outer loop , no written 
  while (top<=bottom&&left<=right) {
    int row=top,col=left;    
    //getting values right
        while (col<=right) {
            result.add(matrix[row][col]);
            col++;
        }
        col--;row++;
        //gettig column vise down
        while (row<=bottom) {
            result.add(matrix[row][col]);
            row++;
        }
        row--;col--;
        //to theleft col wise, only if another row exist
        if(top<bottom){
        while (col>=left) {
            result.add(matrix[row][col]);
            col--;
        }
        col++;row--;
        }
        //upward,only if a distinct column exist between left and right
        if (left<right) {
            while (row > top) {
                result.add(matrix[row][col]);
                row--;
            }
        }
        top++;right--;bottom--;left++;
    }
    return result;
}
    // public static void main(String[] args) {
    //     SpiralMatrix sm = new SpiralMatrix();
    //     int[][] matrix = {
    //         {1, 2, 3},
    //         {4, 5, 6},
    //         {7, 8, 9}
    //     };
    //     System.out.println(sm.spiralOrder(matrix));
    // }
}

