package day354.Test3;

//1957. 删除字符使字符串变好
class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)){
                flag = true;
                i++;
            }
            if(flag) res.append(s.charAt(i));
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}
