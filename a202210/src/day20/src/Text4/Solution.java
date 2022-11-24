package Text4;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < len; i++) {
            if(s1.charAt(i) == s2.charAt(i)){
                continue;
            }
            if(index1 == -1){
                index1 = i;
            }else if(index2 == -1){
                index2 = i;
            }else{
                return false;
            }
        }
        if(index1 == -1) return true;
        if(index2 == -1) return false;
        return s1.charAt(index1) == s2.charAt(index2) && s1.charAt(index2) == s2.charAt(index1);
    }
}
