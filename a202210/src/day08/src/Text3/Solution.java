package Text3;

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int lens = s.length();
//         int lent = t.length();
//         if(lens != lent) return false;
//         int[] arrS = new int[26];
//         int[] arrT = new int[26];
//         for (int i = 0; i < lens; i++) {
//             int index = s.charAt(i) - 'a';
//             arrS[index] += 1;
//         }
//         for (int i = 0; i < lent; i++) {
//             int index = t.charAt(i) - 'a';
//             arrT[index] += 1;
//         }
//         for (int i = 0; i < 26; i++) {
//             if(arrS[i] != arrT[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        if(lens != lent) return false;
        int[] record = new int[26];
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        for(int i = 0; i < lens; i++){
            record[s1[i] - 'a'] ++;
        }
        for(int i = 0; i < lent; i++){
            record[t1[i] - 'a'] --;
        }

        for(int i = 0; i < record.length; i++){
            if(record[i] != 0){
                return false;
            }
        }
        return true;
    }

}