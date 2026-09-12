class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        for (int k = 0; k < arr.length; k++) {
            StringBuilder st = new StringBuilder(arr[k]);

            int i = 0;
            int j = st.length() - 1;

            while (i < j) {
                char temp = st.charAt(i);

                st.setCharAt(i, st.charAt(j));
                st.setCharAt(j, temp);

                i++;
                j--;
            }

            arr[k] = st.toString();
        }

        String sentence = String.join(" ", arr);

        return sentence;
    }
}