class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] mat = new int[m][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
}