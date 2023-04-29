package day196.Test2;

import java.util.HashMap;
import java.util.Map;

//2451. 差值数组不同的字符串
class Solution {
    public String oddString(String[] words) {
        HashMap<String, Integer> diffCnt = new HashMap<>();
        HashMap<String, String> diff2Word = new HashMap<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < word.length(); i++) {
                sb.append(word.charAt(i) - word.charAt(i - 1));
                sb.append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            String diffStr = sb.toString();
            diffCnt.put(diffStr, diffCnt.getOrDefault(diffStr, 0) + 1);
            diff2Word.put(diffStr, word);

            if(diff2Word.size() == 2){
                for (Map.Entry<String, Integer> entry : diffCnt.entrySet()) {
                    if(entry.getValue() >= 2){
                        diff2Word.remove(entry.getKey());
                        return diff2Word.values().iterator().next();
                    }
                }
            }
        }
        return null;
    }
}
