class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n ,sum =0 , prod = 1;
        while(temp >0){
            int rem = temp %10;
            sum += rem;
            prod *= rem;
            temp /= 10;
        }

        return (n % (sum + prod) == 0)?true : false;
    }
}