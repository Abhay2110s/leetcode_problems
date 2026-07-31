public class Solution{
    public int[] runningsum(int nums[]){
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }
        
        return prefix;
    }
} 
