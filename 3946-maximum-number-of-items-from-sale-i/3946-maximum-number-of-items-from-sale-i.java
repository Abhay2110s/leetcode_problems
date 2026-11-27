class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int [] price = new int[n];
        int []gain = new int[n];

        int minprice= Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
            {
                price[i] = items[i][1];
                minprice=Math.min(minprice,price[i]);
                gain[i] =1;

                for(int j = 0 ;j<n; j++)
            {
                if(i != j && items[j][0] % items[i][0] == 0)
                {
                    gain[i]++;
                }
            }
            }

        int []dp = new int[budget+1];

        for(int i = 0 ;i<n ;i++)
            {
                int cost = price[i];
                int value = gain[i];

                for(int b = budget; b>=cost ; b--)
                    {
                        dp[b] = Math.max(dp[b],dp[b-cost]+value);
                    }
            }

        int ans= 0 ;
        for(int i = 0 ;i<=budget ;i++)
            {
                int first = dp[i];

                int rem = budget - i;
                int extra = rem/minprice;
            
            ans = Math.max(ans,first+extra);
            }
        return ans;
    }
}