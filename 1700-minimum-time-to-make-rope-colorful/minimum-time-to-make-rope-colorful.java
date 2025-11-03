class Solution {
    public int minCost(String colors, int[] neededTime) {
        int total=0;
        int maxtime=neededTime[0];
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                total += Math.min(maxtime, neededTime[i]);
                maxtime = Math.max(maxtime, neededTime[i]);
            }else{
                maxtime = neededTime[i];
            }
        }
        return total;
    }
}