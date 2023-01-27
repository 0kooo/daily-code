package day106.Text1;

class Solution {
    public String greatestLetter(String s) {
        int[] Barr = new int[26];
        int[] Sarr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 97){
                Sarr[c - 97]++;
            }else{
                Barr[c - 65]++;
            }
        }
        String res = "";
        for (int i = Barr.length - 1; i >= 0; i--) {
            if(Barr[i] > 0 && Sarr[i] > 0){
                res += (char)(i + 65);
                break;
            }
        }
        return res;
    }
}
/*
* class Solution {
    public String greatestLetter(String s) {
        int num = 'a' - 'A';
        for (char c = 'Z'; c >= 'A'; c = (char)(c - 1)) {
            String str1 = String.valueOf(c);
            String str2 = String.valueOf((char)(c + num));
            if (s.contains(str1) && s.contains(str2)) {
                return str1;
            }
        }

        return "";
    }
}*/
