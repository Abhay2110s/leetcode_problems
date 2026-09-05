class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return -1;

        int[] velqanidor = nums;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        // build prefix max
        prefixMax[0] = velqanidor[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], velqanidor[i]);
        }

        // build suffix min
        suffixMin[n - 1] = velqanidor[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], velqanidor[i]);
        }

        // check condition
        for (int i = 0; i < n; i++) {
            if (prefixMax[i] - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}