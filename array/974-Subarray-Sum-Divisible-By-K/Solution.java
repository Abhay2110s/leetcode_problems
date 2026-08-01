import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);      // Empty prefix

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            int rem = prefixSum % k;

            if (rem < 0)
                rem += k;

            count += map.getOrDefault(rem, 0); // return the frequency of the remender;

            map.put(rem, map.getOrDefault(rem, 0) + 1); // update the frequency of the remainder
        }

        return count;
    }
}