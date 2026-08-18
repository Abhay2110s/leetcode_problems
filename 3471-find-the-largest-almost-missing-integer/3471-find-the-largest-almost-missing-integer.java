class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];

        for (int num : nums) {
            freq[num]++;
        }

        int ans = -1;

        if (k == 1) {
            for (int num : nums) {
                if (freq[num] == 1) {
                    ans = Math.max(ans, num);
                }
            }
        }

        else if (k == n) {
            for (int num : nums) {
                ans = Math.max(ans, num);
            }
        }

        else {
            if (freq[nums[0]] == 1) {
                ans = Math.max(ans, nums[0]);
            }

            if (freq[nums[n - 1]] == 1) {
                ans = Math.max(ans, nums[n - 1]);
            }
        }

        return ans;
    }
}