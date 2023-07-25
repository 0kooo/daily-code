package day254.Test3;

//2515. 到目标字符串的最短距离
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length, l = startIndex, r = startIndex;
        for (int i = 0; i < n; l = (--l + n) % n, r = ++r % n, i++) {
            if(words[l].equals(target) || words[r].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
