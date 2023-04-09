package day176.Test1;

//2399. 检查相同字母间的距离
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && distance[s.charAt(j) - 'a'] != j - i - 1){
                    return false;
                }
            }
        }
        return true;
    }
}
