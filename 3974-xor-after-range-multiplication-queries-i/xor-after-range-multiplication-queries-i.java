class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        long ans = 0;
        for(int i=0;i<queries.length;i++){
            int idx = queries[i][0];
            int ran = queries[i][1];
            int vii = queries[i][3];
            while(idx<=ran){
                nums[idx] = (int)(((long)nums[idx] * vii) % 1000000007);
                idx += queries[i][2];
            }
            
        }
        for(int i=0;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return (int)ans;

    }
}