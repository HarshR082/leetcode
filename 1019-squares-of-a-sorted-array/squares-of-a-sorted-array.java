class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            long h =nums[i]*nums[i];
            nums[i]= (int) h;
        }
        Arrays.sort(nums);
        return nums;
    }
}