
class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        StringBuilder s1 = new StringBuilder();

        for (int i = word.length - 1; i >= 0; i--) {
            if (s1.length() > 0) {
                s1.append(' ');
            }
            s1.append(word[i]);
        }

        return s1.toString();
    }
}
