class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int l = 0;
        int count = 0;

        String ans = "";

        for (int r = 0; r < s.length(); r++) {

            if (s.charAt(r) == '1') {
                count++;
            }

            // Too many 1s
            while (count > k) {
                if (s.charAt(l) == '1') {
                    count--;
                }
                l++;
            }

            // Exactly k ones
            if (count == k) {

                // Remove leading zeros
                while (s.charAt(l) == '0') {
                    l++;
                }

                String current = s.substring(l, r + 1);

                if (ans.equals("")
                        || current.length() < ans.length()
                        || (current.length() == ans.length()
                            && current.compareTo(ans) < 0)) {

                    ans = current;
                }
            }
        }

        return ans;
    }
}