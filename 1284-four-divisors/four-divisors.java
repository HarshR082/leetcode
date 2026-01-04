class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        
        for (int n : nums) {
            int count = 0;
            int currentSum = 0;
            for (int d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    count++;
                    currentSum += d;
                    if (d * d != n) {
                        count++;
                        currentSum += n / d;
                    }
                }
                if (count > 4) break;
            }
            if (count == 4) {
                totalSum += currentSum;
            }
        }
        return totalSum;
    }
}