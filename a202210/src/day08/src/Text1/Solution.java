package Text1;

import java.util.HashMap;
import java.util.Map;

// class Solution {
//     public int firstUniqChar(String s) {
//         int len = s.length();
//         int number = 0;
//         Map<Character,Integer> map = new HashMap<>();
//         for (int i = 0; i < len; i++) {
//             char ch = s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0) + 1);
//         }
//         for (int i = 0; i < len; i++) {
//             if(map.get(s.charAt(i)) == 1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        int temp;
        for(char i = 'a'; i <= 'z'; i++){
            temp = s.indexOf(i);
            if(temp == -1){
                continue;
            }
            if(temp == s.lastIndexOf(i)){
                len = Math.min(len,temp);
            }
        }
        return len == s.length() ? -1 : len;
    }
}
