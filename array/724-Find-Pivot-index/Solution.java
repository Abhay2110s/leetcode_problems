//! another method 

//? time complexity O(N)
//? space complexity O(N)


public class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int[] leftSum = nums.clone();
        int[] rightSum = nums.clone();

        // Prefix sum
        for (int i = 1; i < n; i++) {
            leftSum[i] += leftSum[i - 1];
        }

        // Suffix sum
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] += rightSum[i + 1];
        }

        // Find pivot
        for (int i = 0; i < n; i++) {

            int left = (i == 0) ? 0 : leftSum[i - 1];
            int right = (i == n - 1) ? 0 : rightSum[i + 1];

            if (left == right)
                return i;
        }

        return -1;
    }
}