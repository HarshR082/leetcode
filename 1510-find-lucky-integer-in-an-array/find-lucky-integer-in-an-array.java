class Solution {
    public int findLucky(int[] arr) {
        int[] dig = new int[501];
        for(int i=0;i<arr.length;i++){
            dig[arr[i]]++;
        }
        for(int k=dig.length-1;k>0;k--){
            if(dig[k]==k) return k;
        }
        return -1;
    }
}