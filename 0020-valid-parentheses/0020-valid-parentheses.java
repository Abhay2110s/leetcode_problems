

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!st.isEmpty()) {
                char top = st.peek();

                if ((curr == ')' && top == '(') ||
                        (curr == '}' && top == '{') ||
                        (curr == ']' && top == '[')) {
                    st.pop();
                    continue;
                }
            }

            st.push(curr);
        }
        return st.isEmpty();
    }
}