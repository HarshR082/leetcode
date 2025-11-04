class Solution {
    public String finalString(String s) {
        String ds ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!='i') ds+=c;
            if(c =='i'){
                ds=rev(ds);
                continue;
            }
        }
        return ds;
    }
    private String rev(String ss){
        StringBuilder sb = new StringBuilder(ss);
        return sb.reverse().toString();
    }
}