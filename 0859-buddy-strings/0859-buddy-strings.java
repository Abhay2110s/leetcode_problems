class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();

            for (char ch : s.toCharArray()) {
                if (!set.add(ch)) {
                    return true;
                }
            }

            return false;
        }

        int first = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        return second != -1
            && s.charAt(first) == goal.charAt(second)
            && s.charAt(second) == goal.charAt(first);
    }
}