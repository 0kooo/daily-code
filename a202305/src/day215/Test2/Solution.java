package day215.Test2;

import java.util.List;

//1773. 统计匹配检索规则的物品数量
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int index = 0;
        if(ruleKey.equals("type")){

        }else if(ruleKey.equals("color")){
            index = 1;
        }else{
            index = 2;
        }
        for (List<String> item : items) {
            if(item.get(index).equals(ruleValue)){
                res++;
            }
        }
        return res;
    }
}