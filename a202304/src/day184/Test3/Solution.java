package day184.Test3;


import java.util.HashSet;
import java.util.Set;

//1935. 可以输入的最大单词数
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(brokenLetters.charAt(i));
        }
        int res = 0;
        String[] arr = text.split(" ");
        for (String s : arr) {
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) res++;
        }
        return res;
    }
}