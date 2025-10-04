class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) return 0;
        int n = height.length;

        // precompute left maxima
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // precompute right maxima
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int minn = Math.min(leftMax[i - 1], rightMax[i + 1]);
            if (minn > height[i]) {
                ans += (minn - height[i]);
            }
        }
        return ans;
    }
}
