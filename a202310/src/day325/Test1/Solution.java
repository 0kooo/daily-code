package day325.Test1;

//2678. 老人的数目
class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if(age > 60) res++;
        }
        return res;
    }
}
