class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int ans=0;
        Stack<Character> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            char c1 = s.charAt(i);
            if(st.size()<1){
                st.push(c1);
            }else{
                char c = st.peek();
                if(c=='a' && c1=='b'){
                    st.pop();
                    ans++;
                }else{
                    st.push(c1);
                }
            }
            
            
        }
        return ans;
    }
}