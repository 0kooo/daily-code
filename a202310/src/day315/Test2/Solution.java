package day315.Test2;

//2269. 找到一个数字的 K 美丽值
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int res = 0;
        for (int i = 0; i + k <= s.length(); ++i){
            String str = s.substring(i, i + k);
            int nu = Integer.parseInt(str);
            if(nu != 0 && num % nu == 0) res++;
        }
        return res;
    }
}
