class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i =0 ;i<nums.length ;i++){
            xor1 ^= nums[i];
            xor2 ^= (i+1);
        }
        return xor1^xor2;
    }
}
    


// class Solution {
//     public int missingNumber(int[] nums) {
//     int esum = 0;
//     int asum = 0;
//     for(int i = 1; i <= nums.length; i++) {
//         esum += i;
//     }
//     for(int i = 0; i < nums.length; i++) {
//         asum += nums[i];
//     }
//     return esum - asum;
//     }
// }
    
