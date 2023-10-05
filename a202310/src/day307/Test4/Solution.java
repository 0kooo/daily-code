package day307.Test4;

import java.util.ArrayList;
import java.util.List;

//2194. Excel 表中某个范围内的单元格
class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        for (int i = s.charAt(0); i <= s.charAt(3); ++i){
            for (int j = s.charAt(1) - '0'; j <= s.charAt(4) - '0'; ++j){
                res.add("" + (char)i + j);
            }
        }
        return res;
    }
}