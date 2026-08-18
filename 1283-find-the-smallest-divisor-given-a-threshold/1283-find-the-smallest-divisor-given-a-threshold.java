class Solution {
    public int divisor(int nums[] , int mid){
        int sum = 0;
        for(int num :nums){
            sum += (long)Math.ceil((double)num/mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0; i<nums.length ;i++){
            high = Math.max(high , nums[i]);
        }
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(divisor(nums ,mid) <= threshold){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}