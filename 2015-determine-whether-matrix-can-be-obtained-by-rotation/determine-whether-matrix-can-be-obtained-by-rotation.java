class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int k=1;k<=4;k++){
            if(issame(mat,target)){
                return true;
            }
            else{
                int[][] temp = new int[n][n];
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        temp[j][n - 1 - i] = mat[i][j];
                    }
                }
                mat=temp;
            }
        }
        return false;
        
    }
    private boolean issame(int[][] mat , int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
}