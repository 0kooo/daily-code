package day81.Text1;

class Solution {
    public int countHomogenous(String s) {
        final long mod = 1000000007;
        long res = 0;
        char prev = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == prev){
                count++;
            }else{
                res += (long) (count + 1) * count / 2;
                count = 1;
                prev = c;
            }
        }
        res += (long) (count + 1) * count / 2;
        return (int) (res % mod);
    }
}
