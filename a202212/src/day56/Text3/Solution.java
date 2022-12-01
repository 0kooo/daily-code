package day56.Text3;

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int mti = 1;
        for (int i = columnTitle.length() - 1; i >= 0 ; --i) {
            int num = columnTitle.charAt(i) - 'A' + 1;
            sum += mti * num;
            mti *= 26;
        }
        return sum;
    }
}
