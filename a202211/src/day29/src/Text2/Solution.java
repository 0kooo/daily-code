package Text2;

class Solution {
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        for (int i = 0; i + lenN <= lenH; i++) {
            boolean flag = true;
            for (int j = 0; j < lenN; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}
