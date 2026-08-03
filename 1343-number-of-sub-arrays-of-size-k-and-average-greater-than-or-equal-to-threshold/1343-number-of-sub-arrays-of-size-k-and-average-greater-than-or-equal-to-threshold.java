class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0 , count = 0 ,avg = 0;
        for(int i = 0 ; i<k ; i++){
            sum += arr[i];
        }
        avg = sum/k;
        if(avg >= threshold){
            count++;
        }

        for(int i = k ; i<n ;i++){
            sum += arr[i];
            sum -= arr[i-k];

            avg = sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
}