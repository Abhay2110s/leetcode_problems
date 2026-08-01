class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int prefix = 0;
        map.put(0,-1);

        for(int i = 0 ;i<nums.length ;i++){
            prefix += nums[i];

            int rem = prefix % k;

            if(rem < 0){
                rem +=k;
            }

            if(map.containsKey(rem)){ // if same remainder comes it return true
                if(i - map.get(rem) >= 2){
                    return true;
                }
            }
            else{
                map.put(rem , i);
            }
        }
        return false;
    }
}