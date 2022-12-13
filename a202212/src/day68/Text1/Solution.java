package day68.Text1;

class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        int[] num = new int[26];
        for (char c : chars) {
            num[c - 'a']++;
        }
        for (int i : num) {
            if(i == 0){
                return false;
            }
        }
        return true;
    }
}
