package day261.Test1;

import java.util.ArrayList;
import java.util.List;

//722. 删除注释
class Solution {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (String s : source) {
            int n = s.length();
            for (int i = 0; i < n; i++) {
                if(flag){
                    if(i + 1 < n && s.charAt(i) == '*' && s.charAt(i + 1) == '/'){
                        flag = false;
                        i++;
                    }
                }else{
                    if(i + 1 < n && s.charAt(i) == '/' && s.charAt(i + 1) == '/'){
                        break;
                    }else if(i + 1 < n && s.charAt(i) == '/' && s.charAt(i + 1) == '*'){
                        flag = true;
                        i++;
                    }else{
                        sb.append(s.charAt(i));
                    }
                }
            }
            if(!flag && sb.length() > 0){
                res.add(sb.toString());
                sb.setLength(0);
            }
        }
        return res;
    }
}
