package day304.Test1;


//2231. 按奇偶性交换后的最大数字
class Solution {
    public int largestInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int n1 = arr[i] - '0';
                int n2 = arr[j] - '0';
                if(n1 < n2 && ((n1 % 2 == 0 && n2 % 2 == 0) || (n1 % 2 == 1 && n2 % 2 == 1))){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return Integer.parseInt(sb.toString());
    }
}