package day188.Test2;

import java.util.*;

//1452. 收藏清单
class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        /*List<Integer> res = new ArrayList<>();
        int max = 0, index = 0, len = favoriteCompanies.size();
        for (int i = 0; i < len; i++) {
            int size = favoriteCompanies.get(i).size();
            if(max <= size){
                max = size;
                index = i;
            }
        }
        res.add(index);
        Set<String> set = new HashSet<>(favoriteCompanies.get(index));
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            List<String> f = favoriteCompanies.get(i);
            for (String s : f) {
                if(!set.contains(s)){
                    flag = true;
                    break;
                }
            }
            if(flag) res.add(i);
        }
        Collections.sort(res);
        return res;*/

        List<Integer> res = new ArrayList<>();
        int n = favoriteCompanies.size();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }
                List<String> companies1 = favoriteCompanies.get(i);
                List<String> companies2 = favoriteCompanies.get(j);
                Set<String> set = new HashSet<>(companies2);
                if(set.containsAll(companies1)){
                    flag = false;
                    break;
                }
            }
            if(flag) res.add(i);
        }
        return res;
    }
}
