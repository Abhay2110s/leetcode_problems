class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int n = p.length();

        int[] pfreq = new int[26];
        int[] window = new int[26];
        for (int i = 0; i < n; i++) {
            pfreq[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pfreq, window)) {
            ans.add(0);
        }

        for (int i = n; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i - n) - 'a']--;

            if (Arrays.equals(pfreq, window)) {
                ans.add(i - n + 1);
            }
        }

        return ans;
    }
}