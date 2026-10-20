class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();
        Stack<Character> stk = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                stk.push((char) ('a' + num - 1));
                i -= 2;
            } else {
                int num = s.charAt(i) - '0';
                stk.push((char) ('a' + num - 1));
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }

        return sb.toString();
    }
}