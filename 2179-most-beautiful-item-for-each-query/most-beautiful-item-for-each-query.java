import java.util.*;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {

        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));
        int n = items.length;
        for (int i = 1; i < n; i++) {
            items[i][1] = Math.max(items[i][1], items[i - 1][1]);
        }
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            int left = 0, right = n - 1;
            int idx = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (items[mid][0] <= q) {
                    idx = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            ans[i] = (idx == -1) ? 0 : items[idx][1];
        }

        return ans;
    }
}
