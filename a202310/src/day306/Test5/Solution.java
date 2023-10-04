package day306.Test5;

import java.util.*;

class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        for (String str : arr) {
            int n = str.length();
            char c = str.charAt(n - 1);
            String newS = str.substring(0, n - 1);
            map.put(c - '0', newS);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ++i) {
            sb.append(map.get(i + 1));
            if(i == arr.length - 1)break;
            sb.append(" ");
        }
        return sb.toString();
    }
}