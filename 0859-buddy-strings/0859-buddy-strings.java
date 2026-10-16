import java.util.*;

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

        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                a.add(s.charAt(i));
                b.add(goal.charAt(i));
            }
        }

        return a.size() == 2
            && a.get(0) == b.get(1)
            && a.get(1) == b.get(0);
    }
}