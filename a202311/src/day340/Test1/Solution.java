package day340.Test1;

//788. 旋转数字
class Solution {
    public int rotatedDigits(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            String str = String.valueOf(i);
            boolean flag = true;
            for (int j = 0; j < str.length(); j++){
                int c = str.charAt(j) - '0';
                if(c == 0 || c == 1 || c == 8) sb.append(c);
                else if(c == 2) sb.append(5);
                else if(c == 5) sb.append(2);
                else if(c == 6) sb.append(9);
                else if(c == 9) sb.append(6);
                else{
                    flag = false;
                    break;
                }
            }
            if(flag && i != Integer.parseInt(sb.toString())) res++;
        }
        return res;
    }
}
