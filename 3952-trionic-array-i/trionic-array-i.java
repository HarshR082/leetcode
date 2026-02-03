class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<4) return false;
        int p=0;
        int q=0;
        boolean pf = false;
        boolean qf=false;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<=nums[i-1]){
                p=i-1;
                pf=true;
                break;
            }
        }
        if (!pf || p == 0) return false;
        for(int i=p+1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                q=i-1;
                qf=true;
                break;
            }
        }
        if (!qf || q == p) return false;
        for (int i = q + 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) return false;
        }
        return q < nums.length - 1;
    }
}