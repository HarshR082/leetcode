import java.util.Arrays;

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        Arrays.sort(nums);

        int i = 0;
        int j = 0;

        while (j < n) {

            // If condition breaks move i
            while (i <= j && (long) nums[j] > (long) k * nums[i]) {
                i++;
            }

            // Track max window size
            ans = Math.max(ans, j - i + 1);

            j++;
        }

        return n - ans;
    }
}
