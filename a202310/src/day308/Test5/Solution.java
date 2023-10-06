package day308.Test5;

//2243. 计算字符串的数字和
class Solution {
    public String digitSum(String s, int k) {
        String res = s;
        while (res.length() > k){
            StringBuilder sb = new StringBuilder();
            int n = res.length();
            for (int i = 0; i < res.length(); i += k){
                String str = res.substring(i, Math.min(i + k, n));
                int num = 0;
                for (int j = 0; j < str.length(); ++j) num += str.charAt(j) -'0';
                sb.append(num);
            }
            res = sb.toString();
        }
        return res;
    }
}
