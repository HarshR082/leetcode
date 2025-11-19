class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int n = original;
        for(int i=0;i<nums.length;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==n) found=true;
            }
            if(!found) return n;
            else{
                n=n*2;
            }
            
        }
        return n;
    }
}