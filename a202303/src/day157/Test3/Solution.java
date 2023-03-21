package day157.Test3;

//481. 神奇字符串
class Solution {
    public int magicalString(int n) {
        if(n < 4) return 1;
        char[] s = new char[n];
        s[0] = '1';
        s[1] = '2';
        s[2] = '2';
        int res = 1, i = 2, j = 3;
        while(j < n){
            int size = s[i] - '0';
            int num = 3 - (s[j - 1] - '0');
            while(size > 0 && j < n){
                s[j] = (char) ('0' + num);
                if(num == 1) ++res;
                ++j;
                --size;
            }
            ++i;
        }
        return res;
    }
}
