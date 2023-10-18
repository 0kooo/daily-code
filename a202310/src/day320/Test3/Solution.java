package day320.Test3;

//1071. 字符串的最大公因子
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        for (int i = Math.min(n1, n2); i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                String x = str1.substring(0, i);
                if(check(x, str1) && check(x, str2)){
                    return x;
                }
            }
        }
        return "";
    }

    public boolean check(String x, String str){
        StringBuilder sb = new StringBuilder();
        int len = str.length() / x.length();
        for (int i = 0; i < len; i++) {
            sb.append(x);
        }
        return sb.toString().equals(str);
    }
}
