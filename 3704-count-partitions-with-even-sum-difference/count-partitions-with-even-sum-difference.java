class Solution {
    public int countPartitions(int[] nums) {
        int ans=0;
        int lefts=0;
        for(int i=0;i<nums.length-1;i++){
            lefts+=nums[i];
            int rights=0;
            for(int j=i+1;j<nums.length;j++){
                rights+=nums[j];
            }
            int n = Math.abs(lefts-rights);
            if(n%2==0) ans++;
        }
        return ans;
    }
}