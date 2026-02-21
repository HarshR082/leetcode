class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans =0;
        for(int i=left;i<=right;i++){
            int a = Integer.bitCount(i);
            if(isprime(a)) ans++;
        }
        return ans;
    }
    private boolean isprime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}