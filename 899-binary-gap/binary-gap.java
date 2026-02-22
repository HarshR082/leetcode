class Solution {
    public int binaryGap(int n) {
        int maxx =0;
        String bin = Integer.toBinaryString(n);
        int bit = Integer.bitCount(n);
        if(n>1){
            for(int i=0;i<bin.length()-1;i++){
                if(bin.charAt(i)=='1'){
                    int len =0;
                    for(int j=i+1;j<bin.length();j++){
                        if(bin.charAt(j)=='0') len++;
                        else{
                            len++;
                            maxx=Math.max(len,maxx);
                            break;
                        }
                    }
                }else continue;  
            }
            return maxx;
        }
        return 0;
    }
}