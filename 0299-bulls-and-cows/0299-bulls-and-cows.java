class Solution {
    public String getHint(String secret, String guess) 
    {
        int bulls=0;
        int[] freq1=new int[10];
        int[] freq2=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            freq1[secret.charAt(i)-48]++;
            freq2[guess.charAt(i)-48]++;
        }  
        int cows=0;  
        for(int i=0;i<freq1.length;i++){
            cows+=Math.min(freq1[i],freq2[i]);
        }
        cows=cows-bulls;

        return ""+bulls+"A"+cows+"B";
        
        
    }
}