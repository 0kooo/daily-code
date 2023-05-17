package day213.Test1;

//2446. 判断两个事件是否存在冲突
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[1].compareTo(event2[0]) < 0 || event2[1].compareTo(event2[0]) < 0);
    }
}
