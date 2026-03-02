class Solution {
    public int minSwaps(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0) count++;
                else break;
            }
            arr[i]=count;
        }

        for(int i=0;i<n;i++){
            int mintrail = n-1-i;
            if(arr[i]<mintrail){
                int j=i+1;
                while(j<n && arr[j]<mintrail) j++;
                if(j==n) return -1;
                while(j>i){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    ans++;
                    j--;
                }
            }
        }
        return ans;
    }
}