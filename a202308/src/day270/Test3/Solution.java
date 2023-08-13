package day270.Test3;

//1736. 替换隐藏数字得到的最晚时间
class Solution {
    public String maximumTime(String time) {
        StringBuilder res = new StringBuilder();
        if(time.charAt(0) != '?' && time.charAt(1) == '?'){
            res.append(time.charAt(0));
            if(time.charAt(0) == '1' || time.charAt(0) == '0') {
                res.append(9);
            }else{
                res.append(3);
            }
        }else if(time.charAt(0) == '?' && time.charAt(1) != '?'){
            if(time.charAt(1) > '3'){
                res.append(1);
            }else{
                res.append(2);
            }
            res.append(time.charAt(1));
        }else if(time.charAt(0) == '?' && time.charAt(1) == '?'){
            res.append(2);
            res.append(3);
        }else{
            res.append(time.charAt(0));
            res.append(time.charAt(1));
        }
        res.append(':');
        if(time.charAt(3) == '?') res.append(5);
        else res.append(time.charAt(3));
        if(time.charAt(4) == '?') res.append(9);
        else res.append(time.charAt(4));
        return res.toString();
    }
}
