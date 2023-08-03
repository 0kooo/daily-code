package day261.Test3;

//2678. 老人的数目
class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        for (String detail : details) {
            String[] arr = detail.split("[FMO]");
            int age = (arr[1].charAt(0) - '0' * 10) + (arr[1].charAt(1) - '0');
            if(age > 60) res++;
        }
        return res;
    }
}
