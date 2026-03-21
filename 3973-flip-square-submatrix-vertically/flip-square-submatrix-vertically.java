class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int p1 = x;
        int p2 = x+k-1;
        if(k==1) return grid;
        while(p1<=p2){
            for(int i=0;i<k;i++){
                int temp = grid[p1][i+y];
                grid[p1][i+y]=grid[p2][i+y];
                grid[p2][i+y]=temp;
            }
            p1++;
            p2--;
        }
        return grid;
    }
}