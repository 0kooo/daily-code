package Text1;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n = Math.max(a.length(),b.length());
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            temp += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            sb.append((char)(temp % 2 + '0'));
            temp /= 2;
        }

        if(temp > 0){
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }
}
