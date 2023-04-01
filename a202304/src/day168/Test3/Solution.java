package day168.Test3;

import java.util.HashSet;
import java.util.Set;

//929. 独特的电子邮件地址
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] arr = email.split("@");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr[0].length(); i++) {
                char c = arr[0].charAt(i);
                if(c == '+') break;
                if(c >= 'a' && c <= 'z') sb.append(c);
            }
            sb.append("@").append(arr[1]);
            String s = sb.toString();
            set.add(s);
        }
        return set.size();
    }
}
