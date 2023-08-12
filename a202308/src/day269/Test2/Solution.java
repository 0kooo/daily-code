package day269.Test2;

//1323. 6 和 9 组成的最大数字
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(flag && c != '9'){
                res.append('9');
                flag = false;
            }else{
                res.append(c);
            }
        }
        return Integer.parseInt(res.toString());
    }
}
