class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minval = Integer.MAX_VALUE;
        int ans = -1;
        for(int  i= 0 ; i< drones.length ;i++){
            int sum = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
                if(sum<=drones[i][2]){

            if(sum < minval){
                minval = sum;
                ans = i;
            }
                }

        }
        return ans;
    }
}