package day240.Test2;

//1716. 计算力扣银行的钱
class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int count = n / 7;
        for (int i = 0; i < count; i++){
            for (int j = i + 1; j <= 7 + i; j++){
                res += j;
            }
        }
        if(count * 7 == n) return res;
        else {
            int temp = n % 7;
            int i = count + 1;
            while (temp > 0){
                res += i;
                i++;
                temp--;
            }
        }
        return res;
    }
}
