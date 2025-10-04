class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int l = height[start];
            int r = height[end];
            int minn = Math.min(l,r);
            int water = minn*(end-start);
            ans = Math.max(ans,water);
            if(l<r) start++;
            else end--;
        }
        return ans;
    }
}