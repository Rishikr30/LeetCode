class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        for(int i=0; i<m; i++){
        int n = matrix[i].length;
        for(int j=0; j<n; j++){
            if(matrix[i][j]==target){
                return true;
            
            }
        }
        }
        return false;
    }
}