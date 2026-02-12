class Solution {
    public int longestBalanced(String s) {
        int ans =0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int[] freq = new int[26];
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                freq[c-'a']++;
                int maxx =0;
                for(int k=0;k<26;k++){
                    if(freq[k]>0) maxx = freq[k];
                }
                boolean istrue = true;
                for(int k=0;k<26;k++){
                    if(freq[k]==0 || freq[k]==maxx) continue;
                    else{
                        istrue = false;
                        break;
                    }
                }
                if(istrue){
                    int len = j-i+1;
                    ans = Math.max(len,ans);
                }
            }
        }
        return ans;
    }
}