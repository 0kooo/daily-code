package day138.Text2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int res = 0;
        for (String operation : operations) {
            int n = list.size();
            switch (operation.charAt(0)){
                case '+':
                    res += list.get(n - 1) + list.get(n - 2);
                    list.add(list.get(n - 1) + list.get(n - 2));
                    break;
                case 'D':
                    res += list.get(n - 1) * 2;
                    list.add(list.get(n - 1) * 2);
                    break;
                case 'C':
                    res -= list.get(n - 1);
                    list.remove(n - 1);
                    break;
                default:
                    res += Integer.parseInt(operation);
                    list.add(Integer.parseInt(operation));
                    break;
            }
        }
        return res;
    }
}
