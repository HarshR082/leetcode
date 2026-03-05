class Solution {
    public int minOperations(String s) {
        int ans0=0;
        int ans1=0;
        for(int i=0;i<s.length();i++){
            char exp0 = (i%2==0) ? '0' : '1';
            char exp1 = (i%2==0) ? '1' : '0';

            if(s.charAt(i)!=exp0) ans0++;
            if(s.charAt(i)!=exp1) ans1++;
        }
        return Math.min(ans0,ans1);
        

    }
}