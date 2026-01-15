class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int s = Math.min(maxx(hBars),maxx(vBars));
        return s*s;

    }
    private int maxx(int[] bars){
        int res = 1, streak=1;
        for(int i=1;i<bars.length;i++){
            if(bars[i]-bars[i-1] == 1) streak++;
            else streak=1;
            res = Math.max(res,streak);
        }
        return ++res;
    }
}