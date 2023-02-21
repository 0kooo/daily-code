package day130.Text2;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        while(i >= 0 || j >= 0 || add != 0){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + add;
            res.append(sum % 10);
            add = sum / 10;
            --i;
            --j;
        }
        res.reverse();
        return res.toString();
    }
}
