package day202.Test2;

//1614. 括号的最大嵌套深度
class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                max++;
            }else if(c == ')')max--;
            if(max > res){
                res = max;
            }
        }
        return res;
    }
}
