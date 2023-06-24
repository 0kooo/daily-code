package day240.Test3;

//1417. 重新格式化字符串
class Solution {
    public String reformat(String s) {
        int n = s.length();
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                count1++;
            }
        }
        if(Math.abs(count1 - (n - count1)) > 1) return "";
        boolean flag = count1 > (n - count1);
        char[] arr = s.toCharArray();
        for (int i = 0, j = 1; i < n; i += 2){
            if(Character.isDigit(arr[i]) != flag){
                while (Character.isDigit(arr[j]) != flag){
                    j += 2;
                }
                swap(arr, i, j);
            }
        }
        return new String(arr);
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
