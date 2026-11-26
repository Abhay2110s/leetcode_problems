class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) return false;

        int count = 0;
        int total = 10;

        while (n >= total) {
            n = n - total;
            count++;
            total--;
        }

        return (count % 2 != 0);
    }
}
