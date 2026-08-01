// O(N)

import java.util.HashMap;

class Solution_optimal {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1); // prefix,freq;

        int prefix = 0;
        int count = 0;

        for(int num : nums){
            prefix += num;

            count += map.getOrDefault(prefix-goal,0);

            map.put(prefix ,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}