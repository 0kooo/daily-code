package day97.Text1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        boolean flag = false;
        StringBuilder key = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                flag = true;
            }else if(c == ')'){
                if(map.containsKey(key.toString())){
                    res.append(map.get(key.toString()));
                }else{
                    res.append('?');
                }
                flag = false;
                key.setLength(0);
            }else{
                if(flag){
                    key.append(c);
                }else{
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}
