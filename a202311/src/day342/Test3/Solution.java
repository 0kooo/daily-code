package day342.Test3;

//1880. 检查某单词是否等于两单词之和
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String sb = "";
        int sum = 0;
        for (int i = 0; i < firstWord.length(); i++) sb += (firstWord.charAt(i) - 'a');
        sum += (Integer.parseInt(sb));
        sb = "";
        for (int i = 0; i < secondWord.length(); i++) sb += (secondWord.charAt(i) - 'a');
        sum += (Integer.parseInt(sb));
        sb = "";
        for (int i = 0; i < targetWord.length(); i++) sb += (targetWord.charAt(i) - 'a');
        return sum == Integer.parseInt(sb);
    }
}