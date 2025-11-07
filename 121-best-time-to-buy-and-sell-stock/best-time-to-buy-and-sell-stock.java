class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minc=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<minc) minc=i;
            else if((i-minc)>maxp) maxp=i-minc;
        }
        return maxp;
    }
}