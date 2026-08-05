class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; // write pointer

        for (int i = 0; i < nums.length; i++) { // read pointer
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}