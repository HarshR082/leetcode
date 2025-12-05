class Solution {
    public int countPartitions(int[] nums) {
        int ans=0;
        int lefts=0;
        int total=0;
        for(int i : nums) total+=i;
        for(int i=0;i<nums.length-1;i++){
            lefts+=nums[i];
            int rights=total-lefts;
            int n = Math.abs(lefts-rights);
            if(n%2==0) ans++;
        }
        return ans;
    }
}