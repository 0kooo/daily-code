package day117.Text1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);
        res.add(folder[0]);
        for (int i = 0; i < folder.length; i++) {
            int m = res.get(res.size() - 1).length();
            int n = folder[i].length();
            if(m >= n || !(res.get(res.size()- 1).equals(folder[i].substring(0, m)) && folder[i].charAt(m) == '/')){
                res.add(folder[i]);
            }
        }
        return res;
    }
}
/*
* class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> set = new HashSet<>();
        for (String f : folder) {
            set.add(f);
        }
        List<String> ans = new ArrayList<>();
        for (String f : folder) {
            boolean subFolder = false;

            // 判断父目录是否存在
            for (int i = 1; i < f.length(); i++) {
                if (f.charAt(i) == '/') {
                    String parentFolder = f.substring(0, i);
                    if (set.contains(parentFolder)) {
                        subFolder = true;
                        break;
                    }
                }
            }

            if (!subFolder) ans.add(f);
        }
        return ans;
    }
}*/