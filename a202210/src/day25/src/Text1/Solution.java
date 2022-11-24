package Text1;

class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        String res = "";
        for (char c : arr) {
            res += c;
        }
        return res;
        //直接调用方法
        //return s.toLowerCase();
    }
}
