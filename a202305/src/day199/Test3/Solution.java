package day199.Test3;

//1047. 删除字符串中的所有相邻重复项
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(index >=0 && res.charAt(index) == c){
                res.deleteCharAt(index);
                index--;
            }else {
                index++;
                res.append(c);
            }
        }
        return res.toString();
    }
}
