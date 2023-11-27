package day360.Test2;

//2396. 严格回文的数字
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++){
            StringBuilder sb = new StringBuilder();
            int temp = n;
            while (temp != 0){
                sb.append(temp % i);
                temp /= i;
            }
            String str = sb.toString();
            if(!str.equals(sb.reverse().toString())) return false;
        }
        return true;
    }
}