class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int rest = n%7;
        int ans = (weeks * (49+7*weeks) + rest * (2*weeks+rest+1)) /2;
        return ans;
       
    }
}