package day207.Test2;

//1528. 重新排列字符串
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder();
        int n = s.length();
        int index = 0;
        while (index < n){
            for (int i = 0; i < n; i++) {
                if(indices[i] == index){
                    res.append(s.charAt(i));
                    break;
                }
            }
            index++;
        }
        return res.toString();
    }
}