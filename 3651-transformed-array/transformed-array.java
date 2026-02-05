class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int k = nums[i];
            if(k>0){
                int ne=0;
                for(int j=0;j<=k;j++){
                    ne = nums[((i+j)%n)];
                }
                ans[i]=ne;
            }
            else if(k<0){
                int ne=0;
                int h = Math.abs(k);
                int currindx = i;
                while(h!=0){
                    currindx=(currindx-1+n)%n;
                    ne = nums[currindx];
                    h--;
                }
                ans[i]=ne;
            }else{
                ans[i]=nums[i];
            }
        }
        return ans;
    }
}