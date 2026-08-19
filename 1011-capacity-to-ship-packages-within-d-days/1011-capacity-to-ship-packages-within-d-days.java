class Solution {
    public int totaldays(int[] weights , int mid){
        int day = 1 ,load = 0;
        for(int i = 0 ;i< weights.length ; i++){
            if(load + weights[i] > mid){
                day++;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int high = 0;
        int low = Integer.MIN_VALUE;
        for(int i = 0 ;i<n ;i++){
            high +=weights[i];
            low = Math.max(low,weights[i]);
        }

        while(low<=high){
            int mid = (low+high)/2;
            int nodays = totaldays(weights , mid);
            if(nodays <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}