package day168.Test1;

import java.util.ArrayList;
import java.util.List;

//831. 隐藏个人信息
class Solution {
    public String maskPII(String s) {
        StringBuilder res = new StringBuilder();
        int len = s.length();
        if(s.contains("@")){/*s.matches("[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+")*/
            s = s.toLowerCase();
            String[] arr = s.split("@");
            res.append(arr[0].charAt(0)).append("*****").append(arr[0].charAt(arr[0].length() - 1)).append("@");
            res.append(arr[1].toLowerCase());
        }else{
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if(c >= '0' && c <= '9'){
                    list.add(c);
                }
            }
            switch (list.size()) {
                case 10 -> {
                    res.append("***-***-");
                    break;
                }
                case 11 -> {
                    res.append("+*-***-***-");
                    break;
                }
                case 12 -> {
                    res.append("+**-***-***-");
                    break;
                }
                case 13 -> {
                    res.append("+***-***-***-");
                    break;
                }
            }
            for (int i = list.size() - 4; i < list.size(); i++) {
                res.append(list.get(i));
            }
        }
        return res.toString();
    }
}
