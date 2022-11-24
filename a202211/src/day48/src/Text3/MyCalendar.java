package Text3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyCalendar {

    List<int[]> list;
    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] arr : list) {
            int l = arr[0];
            int r = arr[1];
            if(l < end && start < r){
                return false;
            }
        }
        list.add(new int[]{start, end});
        return true;
    }
}
