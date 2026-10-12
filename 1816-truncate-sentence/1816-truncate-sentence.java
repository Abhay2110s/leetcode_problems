class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0 ;
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words)
        {
            sb.append(word);
            count++;
            if(count == k) break;
            sb.append(" ");
        }
        return sb.toString();
    }
}