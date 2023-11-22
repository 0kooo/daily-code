package day355.Test3;

//2138. 将字符串拆分为若干长度为 k 的组
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length(), i = 0, index = 0;
        String[] res = new String[(int)Math.ceil((double)n/k)];
        while (i + k <= n){
            res[index] = s.substring(i, i + k);
            i += k;
            index++;
        }
        if(i < n){
            res[index] = s.substring(i, n);
            for (int j = 0; j < k - (n % k); j++) res[index] += fill;
        }
        return res;
    }
}