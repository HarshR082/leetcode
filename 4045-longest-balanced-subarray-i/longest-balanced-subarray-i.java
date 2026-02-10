class Solution {
    public int longestBalanced(int[] nums) {
        int maxans=0;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            int oddc =0;
            int evenc=0;
            for(int j=i;j<nums.length;j++){
                int n = nums[j];
                if(map.get(n)==null){
                    map.put(n,1);
                    if(n%2==0) evenc++;
                    else oddc++;
                }
                if(evenc==oddc){
                    int ans = j-i+1;
                    maxans = Math.max(maxans,ans);
                } 
            } 
        }
        return maxans;

    }
}