class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int min) {
       int n = grumpy.length;
       int max = 0 ,sum = 0 ,basesum = 0;

        // for owner -> 0
        for(int i = 0 ;i<n ;i++){
            if(grumpy[i] == 0){
                basesum += customers[i];
            }
        }

        // for window size
        for(int i = 0; i<min ; i++){
            if(grumpy[i] == 1){
                sum += customers[i];
            }
        }
        max = sum;

        //sliding window approach
        for(int i = min ;i<n ;i++){
            if(grumpy[i] == 1){
                sum += customers[i];
            }
            if(grumpy[i-min] == 1){
                sum -= customers[i-min];
            }

            max = Math.max(max,sum);
        }
        return (basesum +max);
    }
}