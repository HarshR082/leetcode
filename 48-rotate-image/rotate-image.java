class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] trans = new int[n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        int[][] trans1 = new int[n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                trans1[i][n-j-1]=trans[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=trans1[i][j];
            }
        }
    }
}