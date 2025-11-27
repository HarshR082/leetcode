import java.util.Arrays;

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxsum = Long.MIN_VALUE;

        // minPrefix[r] = minimum prefix sum seen at indices with index % k == r
        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, Long.MAX_VALUE);

        long prefix = 0L;          // prefix sum up to current index
        minPrefix[0] = 0L;         // prefix[0] = 0 at index 0 (0 % k == 0)

        // i is the prefix index (from 1 to n), representing sum of nums[0..i-1]
        for (int i = 1; i <= n; i++) {
            prefix += nums[i - 1];        // update prefix with nums[i-1]
            int rem = i % k;

            // If we have seen some prefix with same remainder,
            // then subarray (that has length divisible by k) sum = prefix - minPrefix[rem]
            if (minPrefix[rem] != Long.MAX_VALUE) {
                maxsum = Math.max(maxsum, prefix - minPrefix[rem]);
            }

            // Update the minimum prefix for this remainder
            if (prefix < minPrefix[rem]) {
                minPrefix[rem] = prefix;
            }
        }

        return maxsum;
    }
}
