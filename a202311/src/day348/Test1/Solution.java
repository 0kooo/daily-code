package day348.Test1;

//1694. 重新格式化电话号码
class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if(Character.isDigit(c)) sb.append(c);
        }
        int pos = 0, n = sb.length();
        StringBuilder res = new StringBuilder();
        while (n > 0){
            if(n > 4){
                res.append(sb.substring(pos, pos + 3) + "-");
                n -= 3;
                pos += 3;
            }else{
                if(n == 4){
                    res.append(sb.substring(pos, pos + 2) + "-" + sb.substring(pos + 2, pos + 4));
                }else{
                    res.append(sb.substring(pos, pos + n));
                }
                break;
            }
        }
        return res.toString();
    }
}
