package day187.Test3;


import java.util.HashSet;

//2062. 统计字符串中的元音子字符串
class Solution {
    public int countVowelSubstrings(String word) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            HashSet<Character> s = new HashSet<>();
            for(int j = i; j < word.length(); j++){
                s.add(word.charAt(j));
                if(set.equals(s)){
                    count++;
                }
            }
        }
        return count;
    }
}
/*
*
class Solution {
    public int countVowelSubstrings(String word) {
        int cnt = 0;
        int l = word.length();
        if (l<5)
            return 0;
        for (int i = 0; i < l; i++){
            HashSet <Character> character = new HashSet<>();
            for (int j = i; j < l; j++){
                if(!vowel(word.charAt(j)))
                    break;
                character.add(word.charAt(j));
                if(character.size()==5)
                    cnt++;
            }
        }
        return cnt;
    }
    public boolean vowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i'
        || ch == 'o' || ch == 'u';
    }
}
* */
