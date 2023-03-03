package day139.Text1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        int n = names.length;
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            String name = names[i];
            if(!map.containsKey(name)){
                res[i] = name;
                map.put(name, 1);
            }else{
                int k = map.get(name);
                while(map.containsKey(addSuffix(name, k))){
                    k++;
                }
                res[i] = addSuffix(name, k);
                map.put(name, k + 1);
                map.put(addSuffix(name, k), 1);
            }
        }
        return res;
    }

    public String addSuffix(String name, int k){
        return name + "(" + k + ")";
    }
}

/*
* class Solution {
    Map<String, Integer> map;
    public String[] getFolderNames(String[] names) {
        map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            names[i] = dfs2(names[i]);
        }
        return names;
    }

    private String dfs2(String name) {
        String res = "";
        //没有重复文件，直接存储
        if (!map.containsKey(name)) {
            map.put(name, 0);
            res = name;
        } else {
            //有重复文件，先累加数字
            int num = map.get(name) + 1;
            map.put(name, num);
            name = name + "(" + num + ")";
            while (map.containsKey(name)) {
                name = addNum(name);
            }
            map.put(name, 0);
            res = name;
        }
        return res;
    }

    private String addNum(String name) {
        //截取重复文件的尾标+1；
        String key = name.substring(0, name.lastIndexOf("("));
        int num = Integer.valueOf(map.getOrDefault(key, 0) + 1);
        map.put(key, num);
        name = key + "(" + num + ")";
        return name;

    }
}
* */