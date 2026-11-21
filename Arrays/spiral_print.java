

//https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int sr = 0, er = n-1 , sc = 0, ec = m-1
        
        while(sr<=er && sc<=ec){
            for(int col=sc; col<=ec; col++){
                result.add(matrix[sr][col]);
            }
            sr++;
            for(int row=sr; row<=er; row++){
                result.add(matrix[row][ec]);
            }
            ec--;
            if(sr<=er){
            for(int col=ec; col>=sc; col--){
                result.add(matrix[er][col]);
            }
            er--;
            }
            if(sc<=ec){
            for(int row=er; row>=sr; row--){
                result.add(matrix[row][sc]);
            }
            sc++; 
            }
        }
        return result;
    }
}
