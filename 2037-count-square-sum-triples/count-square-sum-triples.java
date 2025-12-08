class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int i=1;i<=n-2;i++){
            int a = i*i;
            for(int j=i+1;j<=n-1;j++){
                int b = j*j;
                for(int k=j+1;k<=n;k++){
                    int c = k*k;
                    if(a+b==c) ans+=2;
                }
            }
        }
        return ans;
    }
}