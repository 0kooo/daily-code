package day146.Test3;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int index = 0, i = 0;
        for (i = 0, index = -n; i < n; i++) {
            if(s.charAt(i) == c){
                index = i;
            }
            answer[i] = i - index;
        }
        for (i = n - 1, index = 2 * n; i >= 0; --i) {
            if(s.charAt(i) == c){
                index = i;
            }
            answer[i] = Math.min(answer[i], index - i);
        }
        return answer;
    }
}
