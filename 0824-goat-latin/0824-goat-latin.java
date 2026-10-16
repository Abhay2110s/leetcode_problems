class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char ch = word.charAt(0);

            if ("aeiouAEIOU".indexOf(ch) == -1) {
                word = word.substring(1) + ch;
            }

            ans.append(word).append("ma");

            for (int j = 0; j <= i; j++) {
                ans.append('a');
            }

            if (i != words.length - 1) {
                ans.append(' ');
            }
        }

        return ans.toString();
    }
}