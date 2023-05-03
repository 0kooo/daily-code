package day199.Test1;

//1003. 检查替换后的词是否有效
class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);
            int n = sb.length();
            if(n >= 3 && sb.substring(n - 3).equals("abc")){
                sb.delete(n - 3, n);
            }
        }
        return sb.isEmpty();
    }
}
