class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String k="";
            for(int i=0;i<s.length()-1;i++){
                int n1 = Character.getNumericValue(s.charAt(i));
                int n2 = Character.getNumericValue(s.charAt(i+1));
                int summ = (n1+n2)%10;
                k=k+String.valueOf(summ);
            }
            s=k;
        }
        return s.charAt(0)==s.charAt(1);
    }
}