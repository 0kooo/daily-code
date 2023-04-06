package day173.Test1;

//1017. 负二进制转换
class Solution {
    public static String baseNeg2(int n) {
        StringBuilder res = new StringBuilder();
        while (n != 0){
            int ge = n & 1;
            res.append(ge);
            n -= ge;
            n /= (-2);
            System.out.println(n) ;
        }
        String s = res.reverse().toString();
        return s.isEmpty() ? "0" : s;
    }
}