package Text3;

class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        int sLen = s.length();
        int tLen = t.length();
        for (int i = 0; i < sLen; i++) {
            arr[(int)(s.charAt(i) - 'a')]++;
        }
        for (int i = 0; i < tLen; i++) {
            if(--arr[(int)(t.charAt(i) - 'a')] < 0){
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
