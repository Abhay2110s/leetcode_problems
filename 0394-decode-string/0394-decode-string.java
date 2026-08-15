class Solution {
    public String decodeString(String s) {

        Stack<Integer> numStk = new Stack<>();
        Stack<String> stringStk = new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                numStk.push(num);
                stringStk.push(curr);

                num = 0;
                curr = "";
            }

            else if (ch == ']') {

                int repeat = numStk.pop();
                String prev = stringStk.pop();

                StringBuilder temp = new StringBuilder(prev);

                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }

                curr = temp.toString();
            }

            else {
                curr += ch;
            }
        }

        return curr;
    }
}