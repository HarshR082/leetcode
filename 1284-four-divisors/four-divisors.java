class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int k = isfour(n);
            ans+=k;
        }
        return ans;
    }
    private int isfour(int n){
        int count=0;
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int d1 = i;
                int d2= n/i;
                if (d1 == d2){
                    count++;
                    sum += d1;
                } else {
                    count += 2;
                    sum += d1 + d2;
                }
            }
        }
        if(count==4) return sum;
        return 0;
    }
}