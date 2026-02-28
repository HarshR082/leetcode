class Solution {
    public int concatenatedBinary(int n) {
        int k = 0;
        long res = 0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0) k++;
            res = ((res<<k)+i)%1000000007;
        }
        return (int) res;
    }
}