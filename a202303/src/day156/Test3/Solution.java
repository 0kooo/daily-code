package day156.Test3;

//443. 压缩字符串
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int res = 0, left = 0;
        for (int read = 0; read < n; read++) {
            if(read == n - 1 || chars[read] != chars[read + 1]){
                chars[res++] = chars[read];
                int num = read - left + 1;
                if(num > 1){
                    int anchor = res;
                    while(num > 0){
                        chars[res++] = (char) (num % 10 + '0');
                        num /= 10;
                    }
                    swap(chars, anchor, res - 1);
                }
                left = read + 1;
            }
        }
        return res;
    }

    public void swap(char[] chars, int left, int right){
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
