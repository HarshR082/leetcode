class Solution {
    public int findComplement(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') sb.append("1");
            if(s.charAt(i)=='1') sb.append("0");
        }
        return Integer.parseInt(sb.toString(),2);

    }
    
}