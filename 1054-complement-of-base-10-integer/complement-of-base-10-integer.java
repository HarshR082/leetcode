class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        String h = flip(s);
        return Integer.parseInt(h,2);

    }
    private String flip(String s){
        String g ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') g+="1";
            if(s.charAt(i)=='1') g+="0";
        }
        return g;
    }
}