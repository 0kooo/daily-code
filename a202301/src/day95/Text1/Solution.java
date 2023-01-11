package day95.Text1;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] newS = s.split(" ");
        if(newS.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length() - 1; i++) {
            for (int j = i; j < pattern.length(); j++) {
                boolean father = pattern.charAt(i) == pattern.charAt(j);
                boolean son = newS[i].equals(newS[j]);
                if(son != father){
                    return false;
                }
            }
        }
        return true;
    }
}
