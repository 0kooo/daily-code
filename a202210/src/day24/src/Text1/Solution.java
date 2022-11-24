package Text1;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int index1 = 0;
        int index2 = 0;
        String result = "";
        while(index1 < len1 && index2 < len2){
            result = result + word1.charAt(index1) + word2.charAt(index2);
            index2++;
            index1++;
        }
        if(index1 < len1){
            for(int i = index1; i < len1; ++i){
                result += word1.charAt(i);
            }
        }
        if(index2 < len2){
            for(int i = index2; i < len2; ++i){
                result += word2.charAt(i);
            }
        }
        return result;
    }
}
