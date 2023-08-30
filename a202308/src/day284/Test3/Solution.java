package day284.Test3;

//482. 密钥格式化
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; --i){
            if(s.charAt(i) != '-'){
                count++;
                res.append(Character.toUpperCase(s.charAt(i)));
                if(count % k == 0) res.append("-");
            }
        }
        if(res.length() > 0 && res.charAt(res.length() - 1) == '-'){
            res.deleteCharAt(res.length() - 1);
        }
        return res.reverse().toString();
    }
}
