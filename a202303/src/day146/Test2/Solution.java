package day146.Test2;

class Solution {
    public String toGoatLatin(String sentence) {
        String[] s = sentence.split(" ");
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            char c = s[i].charAt(0);
            char newc = Character.toLowerCase(c);
            if(newc == 'a' || newc == 'e' || newc == 'i' || newc == '0' || newc == 'u'){
                ret.append(s[i] + "ma");
            }else{
                ret.append(s[i].substring(1) + c + "ma");
            }
            for (int j = -1; j < i; j++) {
                ret.append('a');
            }
            if(i != s.length - 1) ret.append(" ");
        }
        return ret.toString();
    }
}
/*
* class Solution {
    public String toGoatLatin(String sentence) {
        final Set<Character> vowels = new HashSet<Character>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};
        StringBuilder suffix = new StringBuilder().append("ma");
        final char separator = ' ';
        StringBuilder ansBuilder = new StringBuilder();
        Character consonant = null;
        boolean isWordHead = true;
        for (char c : sentence.toCharArray()) {
            if (c == separator) {
                if (consonant != null) {
                    ansBuilder.append(consonant);
                    consonant = null;
                }
                ansBuilder.append(suffix.append('a')).append(separator);
                isWordHead = true;
            } else if (isWordHead && !vowels.contains(c)) {
                consonant = c;
                isWordHead = false;
            } else {
                ansBuilder.append(c);
                isWordHead = false;
            }
        }
        if (consonant != null) {
            ansBuilder.append(consonant);
        }
        ansBuilder.append(suffix.append('a'));
        return ansBuilder.toString();
    }
}
* */