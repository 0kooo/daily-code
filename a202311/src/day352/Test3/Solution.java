package day352.Test3;

//1925. 统计平方和三元组的数目
class Solution {
    public int countTriples(int n) {
        int res = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                for (int k = j + 1; k <= n; ++k) {
                    if(i * i + j * j == k * k) res++;
                }
            }
        }
        return res * 2;
    }
}