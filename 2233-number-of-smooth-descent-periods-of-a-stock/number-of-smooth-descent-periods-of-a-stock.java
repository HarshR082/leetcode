class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=0;
        int count=1;
        for(int i=0;i<prices.length;i++){
            if(i==0){
                ans+=count;
                continue;
            } 
            if(prices[i]==prices[i-1]-1){
                count++;
            }else{
                count=1;
            }
            ans+=count;
            
        }
        return ans;
    }
}