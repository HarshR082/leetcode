class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m-k+1][n-k+1];
        for(int i=0;i<=grid.length-k;i++){
            for(int j=0;j<=grid[0].length-k;j++){
                Set<Integer> set = new HashSet<>();
                for(int x=i;x<i+k;x++){
                    for(int y=j;y<j+k;y++){
                        set.add(grid[x][y]);
                    }
                }
                if(set.size() <= 1){
                    ans[i][j] = 0;
                    continue;
                }
                ArrayList<Integer> list = new ArrayList<>(set);
                Collections.sort(list);
                int maxx=Integer.MAX_VALUE;
                for(int l=1;l<list.size();l++){
                    int q = list.get(l)-list.get(l-1);
                    maxx = (q<maxx) ? q : maxx;
                }
                ans[i][j]=maxx;

            }
        }
        return ans;
    }
}