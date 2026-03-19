class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int ans=0;
        int m = grid.length;
        int n = grid[0].length;

        int[][] prefix = new int[m+1][n+1];
        int[][] updated = new int[m][n];
        int[][] countX = new int[m+1][n+1]; // NEW

        // same conversion
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='X'){
                    updated[i][j]=1;
                } 
                else if(grid[i][j]=='Y') updated[i][j]=-1;
                else updated[i][j]=0;
            }
        }

        // build prefix
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){

                prefix[i][j] = updated[i-1][j-1] 
                                + prefix[i-1][j] 
                                + prefix[i][j-1] 
                                - prefix[i-1][j-1];

                // count X prefix
                countX[i][j] = (grid[i-1][j-1]=='X'?1:0)
                                + countX[i-1][j]
                                + countX[i][j-1]
                                - countX[i-1][j-1];
            }
        }

        // same loop, just replace flag
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(prefix[i][j]==0 && countX[i][j] > 0) ans++;
            }
        }

        return ans;
    }
}