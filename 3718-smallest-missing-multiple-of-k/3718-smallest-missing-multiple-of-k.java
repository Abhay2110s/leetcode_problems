class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i<nums.length ; i++){
            set.add(nums[i]);
        }
        int ele = 0;
        for(int i = 1 ;i<= 105 ; i++){
            if(!set.contains(i*k)){
                ele = i*k;
                break;
            }
        }
        return ele;
    }
}