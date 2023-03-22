package day158.Test2;

//557. 反转字符串中的单词 III
class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int n = s.length();
        while(i < n){
            int start = i;
            while(i < n && s.charAt(i) != ' '){
                i++;
            }
            for (int j = start; j < i; j++) {
                res.append(s.charAt(start + i - 1 -j));
            }
            while(i < n && s.charAt(i) == ' '){
                i++;
                res.append(' ');
            }
        }
        return res.toString();
    }
}
/*
* class Solution {
    public String reverseWords(String s) {
         char[] chars = s.toCharArray();
        int len = chars.length;
        int i =0 ,j=0;
        while (j<=len){
            if (j<len&&chars[j]!=' '){
                j++;
            }else if (j==len||chars[j]==' '){
                int space = j;
                j--;
                while (i<j){
                    char temp = chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                    i++;
                    j--;
                }
                i=space+1;
                j=space+1;
            }
        }
        return String.valueOf(chars);

    }

    }*/