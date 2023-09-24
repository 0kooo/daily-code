package day299.Test2;

//1556. 千位分隔数
class Solution {
    public String thousandSeparator(int n) {
        int count = 0;
        StringBuffer res = new StringBuffer();
        do {
            int cur = n % 10;
            n /= 10;
            res.append(cur);
            ++count;
            if (count % 3 == 0 && n != 0) {
                res.append('.');
            }
        } while (n != 0);
        return res.reverse().toString();
    }
}

