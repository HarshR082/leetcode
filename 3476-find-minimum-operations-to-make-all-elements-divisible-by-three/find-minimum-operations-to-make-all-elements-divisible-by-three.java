class Solution {
    public int minimumOperations(int[] nums) {
        int ans =0;
        for(int j : nums){
            if (j%3!=0){
                ans+=Math.min(j%3,3-(j%3));
            }
        }
        return ans;
    }
}