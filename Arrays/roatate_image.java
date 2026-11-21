

//https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int row=0; row<n; row++){
            for(int col=row+1; col<n; col++){
               int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for(int i=0; i<n; i++){
            int startcol =0;
            int endcol = n-1;
            while(startcol<=endcol){
                int temp = matrix[i][startcol];
                matrix[i][startcol] = matrix[i][endcol];
                matrix[i][endcol] = temp;

                startcol++;
                endcol--;
            }
        }
        
    }
}
