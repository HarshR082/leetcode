class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long total = 0;

        // Step 1: total sum
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                total += grid[i][j];
            }
        }

        // Step 2: vertical cut
        long left = 0;
        for(int col = 0; col < n - 1; col++){
            for(int row = 0; row < m; row++){
                left += grid[row][col];
            }

            long right = total - left;
            if(left == right) return true;
        }

        // Step 3: horizontal cut
        long top = 0;
        for(int row = 0; row < m - 1; row++){
            for(int col = 0; col < n; col++){
                top += grid[row][col];
            }

            long bottom = total - top;
            if(top == bottom) return true;
        }

        return false;
    }
}