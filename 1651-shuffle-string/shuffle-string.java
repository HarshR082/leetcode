class Solution {
    public String restoreString(String s, int[] indices) {
        char[] cc = s.toCharArray();
        for(int i=0;i<indices.length;i++){
            char c = s.charAt(i);
            int ii = indices[i];
            cc[ii]=c;
        }
        String ans="";
        for(char c : cc){
            ans+=c;
        }
        return ans;
        
    }
}