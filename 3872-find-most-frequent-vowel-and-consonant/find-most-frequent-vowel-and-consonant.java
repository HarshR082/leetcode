class Solution {
    public int maxFreqSum(String s) {
        int[] arr = new int[123];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr[c-0]++;
        }
        int maxv=0;
        int maxc=0;
        for(int i=97;i<arr.length;i++){
            if(i==97||i==101||i==105||i==111||i==117){
                maxv=Math.max(arr[i],maxv);
            }else{
                maxc=Math.max(arr[i],maxc);
            }
        }
        return maxv+maxc;
    }
}