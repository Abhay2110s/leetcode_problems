class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int green = 0;
        for(int light : lights){
            green = Math.max(green,light);
        }
        int answer = 0;
        for(int time : arrivalTime){
            int r = time % period;
            int wait;
            if(r < green){
                wait = 0;
            }else{
                wait = period - r;
            }
            answer = Math.max(answer,wait);
        }
        return answer;
    }
}