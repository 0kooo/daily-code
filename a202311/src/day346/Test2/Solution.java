package day346.Test2;

//779. 第K个语法符号
class Solution {
    public int kthGrammar(int n, int k) {
        /*StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(0);
        for (int i = 0; i < n; i++) {
            str = sb.toString();
            sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '0') sb.append("01");
                else sb.append("10");
            }
        }
        str = sb.toString();
        return str.charAt(k - 1) - '0';*/
        if(n == 1) return 0;
        return (k & 1) ^ 1 ^ kthGrammar(n - 1, (k + 1) / 2);
    }
}