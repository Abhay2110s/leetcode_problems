class Solution {
    public boolean isvowel(char c)
    {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
    }
    public int maxVowels(String s, int k) {
        int curr = 0;
        for(int i =0 ; i<k ;i++)
        {
            if(isvowel(s.charAt(i)))
            {
                curr++;
            }
        }
        int max = curr;
        for(int i = k ; i < s.length() ;i++)
        {
            if(isvowel(s.charAt(i))) curr++;
            if(isvowel(s.charAt(i - k))) curr--;
            max = Math.max(max , curr);

            if(max == k) return k;
        }
        return max;

    }
}