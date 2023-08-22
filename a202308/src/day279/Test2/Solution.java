package day279.Test2;

//2566. 替换一个数字后的最大差值
class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int n = s.length(), max = num, min = num;
        String sb = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '9') continue;
            else{
                sb = s.replaceAll(String.valueOf(c), "9");
                max = Math.max(max, Integer.parseInt(sb));
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '0') continue;
            else{
                sb = s.replaceAll(String.valueOf(c), "0");
                min = Math.min(min, Integer.parseInt(sb));
                break;
            }
        }
        return max - min;
    }
}
