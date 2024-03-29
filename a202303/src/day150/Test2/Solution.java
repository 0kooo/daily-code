package day150.Test2;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n != m) return false;
        if(s.equals(goal)){
            int[] count = new int[26];
            for (int i = 0; i < n; i++) {
                count[s.charAt(i) - 'a']++;
                if(count[s.charAt(i) - 'a'] > 1){
                    return true;
                }
            }
            return false;
        }else{
            int first = -1, second = -1;
            for (int i = 0; i < m; i++) {
                if(s.charAt(i) != goal.charAt(i)){
                    if(first == -1) first = i;
                    else if(second == -1) second = i;
                    else return false;
                }
            }
            return (second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first));
        }
    }
}
