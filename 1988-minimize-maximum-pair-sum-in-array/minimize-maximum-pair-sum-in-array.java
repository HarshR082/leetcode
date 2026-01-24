class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int k = n/2;
        int ans =0;
        int i = k;
        int j = n-1;
        while(i<j){
            int temp = nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        for(int p=0;p<k;p++){
            int mm = nums[p]+nums[p+k];
            if(mm>ans) ans = mm;
        }
        return ans;
    }
}