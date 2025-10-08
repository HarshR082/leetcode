class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int n = nums.length;
        int start = 0;
        for(int i=1;i<=n;i++){
            if (i == n || (long)nums[i] != (long)nums[i - 1] + 1) {
                if (start == i - 1) {
                    res.add(String.valueOf(nums[start]));
                } else {
                    
                    res.add(nums[start] + "->" + nums[i - 1]);
                }
                start = i; 
            }
        }

        return res;
        
    }
}