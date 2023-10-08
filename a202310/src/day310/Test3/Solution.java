package day310.Test3;

//738. 单调递增的数字
class Solution {
    public int monotoneIncreasingDigits(int n) {
        if(n < 10) return n;
        char[] arr = String.valueOf(n).toCharArray();
        int i = 0;
        while (i + 1 < arr.length && arr[i] <= arr[i + 1]) i++;
        if(i == arr.length - 1) return n;
        while (i - 1 >= 0 && arr[i - 1] == arr[i]) i--;
        arr[i] = (char)(arr[i] - 1);
        i++;
        while (i < arr.length) {
            arr[i] = '9';
            i++;
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}