class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int count = 0 ;
        int val = 0;
        for(int i = 0 ;i< n ;i++){
            val = Math.max(val , nums[i]);
        }

        for(int i = 0 ;i< n ;i++){
            count = count + val - nums[i];
        }

        return count;
    }
}