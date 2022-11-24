package Text2;


import java.util.HashMap;
import java.util.Map;

/*class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int lenR = ransomNote.length();
        int lenM = magazine.length();
        if(lenM < lenR) return false;
        Map<Character,Integer> mapM = new HashMap<>();
        for (int i = 0; i < lenM; i++) {
            char c = magazine.charAt(i);
            mapM.put(c,mapM.getOrDefault(c,0) + 1);
        }
        for (int i = 0; i < lenR; i++) {
            char c = ransomNote.charAt(i);
            if(!mapM.containsKey(c) || mapM.get(c) == 0){
                return false;
            }
            mapM.put(c, mapM.get(c) - 1);
        }
        return true;
    }
}*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int lenR = ransomNote.length();
        int lenM = magazine.length();
        if(lenM < lenR) return false;
        int[] number = new int[26];
        for (int i = 0; i < lenM; i++) {
            int index = magazine.charAt(i) - 'a';
            number[index] += 1;
        }
        for (int i = 0; i < lenR; i++) {
            int index = ransomNote.charAt(i) - 'a';
            number[index] -= 1;
            if(number[index] < 0){
                return false;
            }
        }
        return true;
    }
}