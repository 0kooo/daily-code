package day148.Test1;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return Build(s).equals(Build(t));
    }

    public String Build(String str){
        StringBuilder ret = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if(c != '#'){
                ret.append(c);
            }else{
                if(ret.length() > 0){
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
        }
        return ret.toString();
    }
}
