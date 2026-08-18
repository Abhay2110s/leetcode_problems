class Solution {
    public boolean possible(int mid ,int [] arr , int m , int k ){
        int cnt = 0 ;
        int bouquets = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] <= mid){
                cnt++;
            }
            else{
                bouquets += cnt/k;
                cnt= 0;
            }
        }
        bouquets += cnt/k; // for the cnt of last elements
        if(bouquets >= m) return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int ans = -1;
        for(int day : bloomDay){
            low = Math.min(low , day);
            high = Math.max(high , day);
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(mid,bloomDay,m,k) == true){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}