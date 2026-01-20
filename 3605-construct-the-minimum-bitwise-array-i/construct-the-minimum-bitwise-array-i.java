class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int k = nums.get(i);
            for(int j=1;j<=k;j++){
                int h = j+1;
                if((j | h)==k){
                    ans[i]=j;
                    break;
                }
            }
            if(ans[i]==0){
                ans[i]=-1;
            }
        }
        return ans;

    }
}