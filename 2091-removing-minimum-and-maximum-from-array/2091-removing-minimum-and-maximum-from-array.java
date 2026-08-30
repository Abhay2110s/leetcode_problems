
class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int min_index = 0;
        int max_index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
                min_index = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }
        }

        int left = Math.min(min_index, max_index);
        int right = Math.max(min_index, max_index);


        int removeleft = right + 1;
        int removeright = nums.length - left;
        int removeboth = (left + 1) + (nums.length - right);

        return Math.min(removeboth, Math.min(removeleft, removeright));
    }
}