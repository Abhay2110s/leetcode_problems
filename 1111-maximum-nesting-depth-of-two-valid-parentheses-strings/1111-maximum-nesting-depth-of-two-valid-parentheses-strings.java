class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int m = seq.length();
        char[] arr = seq.toCharArray();
        int[] res = new int[m];

        int left = -1, q = 0;
        for (char c : arr) {
            int v = c == '(' ? ++left : left--;

            res[q++] = v % 2;
        } 

        return res;
    }
}