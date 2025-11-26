class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len=0;
        int[] arr = new int[27];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr[c-'a']++;
        }
        boolean fou=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                fou=true;
                break;
            }
        }
        if(!fou) return -1;
        for(int i=0;i<s.length()-1;i++){
            for(int j=s.length()-1;j>=0;j--){
                if(s.charAt(i)==s.charAt(j)){
                    len = Math.max(len,j-i-1);
                    break;
                }
            }            
        }
        return len;
    }
}