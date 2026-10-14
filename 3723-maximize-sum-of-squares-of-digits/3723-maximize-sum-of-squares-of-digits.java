class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num * 9 )  return "";

        int nines = sum/9;
        int rem = sum % 9;

        StringBuilder sb = new StringBuilder();

        sb.append("9".repeat(nines));

        if(rem > 0){
            sb.append(rem);            
        }


        while(sb.length() < num){
            sb.append("0");
        }

        return sb.toString();
    }
}