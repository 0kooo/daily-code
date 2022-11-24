package Text2;

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder s1 = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i+2<n&&s.charAt(i+2)=='#'){
                s1.append((char)('j'+(s.charAt(i)-'1')*10+(s.charAt(i+1)-'0')));
                i+=2;
            }else{
                s1.append((char)('a'+(s.charAt(i)-'1')));
            }
        }
        return s1.toString();
    }
}