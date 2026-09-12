class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int i = 0 , j = res.length -1;
        for(int n : nums){
            if(n%2==0){
                res[i] = n;
                i++;
            }
            else{
                res[j] = n ;
                j--;
            }
        }
        return res;
    }
}