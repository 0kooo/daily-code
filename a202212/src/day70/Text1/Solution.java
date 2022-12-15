package day70.Text1;

class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c - 'a' + 1);
        }

        String number = sb.toString();
        for (int i = 1; i <= k && number.length() > 1; i++) {
            int sum = 0;
            for (int j = 0; j < number.length(); j++) {
                char c = number.charAt(j);
                sum += c - '0';
            }
            number = Integer.toString(sum);
        }

        return Integer.parseInt(number);
    }
}
