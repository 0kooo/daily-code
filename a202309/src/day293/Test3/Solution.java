package day293.Test3;

//520. 检测大写字母
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word)) return true;
        else {
            boolean flag = true;
            for (int i = 1; i < word.length(); i++) {
                if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                    flag = false;
                    break;
                }
            }
            return word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && flag;
        }
    }
}
