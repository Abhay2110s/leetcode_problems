class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int l = 0;
        int maxFreq = 0;
        int maxlength = 0;

        for(int r = 0; r < s.length(); r++) {

            freq[s.charAt(r) - 'A']++;

            // maximum frequency character in current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            // characters to replace > k
            while((r - l + 1) - maxFreq > k) {

                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxlength = Math.max(maxlength, r - l + 1);
        }

        return maxlength;
    }
}