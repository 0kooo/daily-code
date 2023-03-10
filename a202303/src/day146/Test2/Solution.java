package day146.aTest2;

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
            for (int j = 1; j < i; j++) {
                ret.append('a');
            }
            if(i != s.length - 1) ret.append(" ");
        }
        return ret.toString();
    }
}
