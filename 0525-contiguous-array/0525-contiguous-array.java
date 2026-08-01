class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);

        int prefixSum = 0 , length = 0;

        for(int i = 0 ;i<nums.length ; i++){
            if(nums[i] == 0){
                prefixSum--;
            }
            else{
                prefixSum++;
            }

            if(map.containsKey(prefixSum)){
                length = Math.max(length,i-map.get(prefixSum));
            }
            else{
                map.put(prefixSum,i);
            }
        }
        return length;
    }
}