package day308.Test2;

//670. 最大交换
class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        int index = 0, n = arr.length, count = 0;
        for (int i = 0; i < n; i++) {
            int max = arr[i];
            for (int j = n - 1; j >= i + 1; j++) {
                if(max < arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            if(max != arr[i] && count == 0){
                char temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        String res = "";
        for (char c : arr) {
            res += c;
        }
        return Integer.parseInt(res);
    }
}
