class Solution {
    public int countPermutations(int[] complexity) {
        int mincap = complexity[0];
        for(int i=1;i<complexity.length;i++){
            if(complexity[i]<=mincap) return 0;
        }
        long ans = 1;
        for(int i=1;i<complexity.length;i++){
            ans = (ans * i) % 1000000007;

        }
        return (int) ans;
    }
}