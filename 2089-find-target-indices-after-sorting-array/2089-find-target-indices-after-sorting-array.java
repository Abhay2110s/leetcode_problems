class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int small = 0 ;
        int count = 0;
        for(int i = 0 ;i< nums.length ;i++){
            if(nums[i] < target){
                small++;
            }
            else if(nums[i] == target){
                count++;
            }
        }

        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ;i<count ; i++){
            arr.add(small+i);
        }
        return arr;
    }
}