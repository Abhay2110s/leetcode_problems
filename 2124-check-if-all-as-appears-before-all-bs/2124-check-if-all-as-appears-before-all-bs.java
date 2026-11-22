
class Solution {
    public boolean checkString(String s) {
        int firstB = s.indexOf('b');
        int lastA = s.lastIndexOf('a');

        return firstB == -1 || lastA < firstB;
    }
}
