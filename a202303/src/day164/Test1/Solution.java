package day164.Test1;

//522. 最长特殊序列 II
class Solution {
    public int findLUSlength(String[] strs) {
        int n = strs.length;
        int res = -1;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if(i != j && isSubseq(strs[i], strs[j])){
                    flag = false;
                    break;
                }
            }
            if(flag) res = Math.max(res, strs[i].length());
        }
        return res;
    }
    public boolean isSubseq(String s, String t){
        int index1 = 0, index2 = 0;
        while (index1 < s.length() && index2 < t.length()){
            if(s.charAt(index1) == t.charAt(index2)){
                index1++;
            }
            index2++;
        }
        return index1 == s.length();
    }
}
