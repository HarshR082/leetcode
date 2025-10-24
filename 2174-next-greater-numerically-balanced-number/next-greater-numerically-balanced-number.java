class Solution {
    public int nextBeautifulNumber(int n) {
        boolean isfound=false;
        for(int i=n+1;i<=1224444;i++){
            if(isnum(i)){
                return i;
            }
        }
        return -1;
    }
    private boolean isnum(int k){
        int[] arr = new int[10];
        int temp=k;
        while(temp>0){
            int d = temp%10;
            arr[d]++;
            temp=temp/10;
        }
        String s = String.valueOf(k);
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i)-'0';
            int b = arr[a];
            if(a!=b) return false;
        }
        return true;
    }
}