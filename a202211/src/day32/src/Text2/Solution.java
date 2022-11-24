package Text2;

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] arr = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; --i) {
            int x = num1.charAt(i) - '0';
            for(int j = len2 - 1; j >= 0; --j){
                int y = num2.charAt(j) - '0';
                arr[i + j + 1] += x * y;
            }
        }
        for(int i = len1 + len2 - 1; i >= 0; --i){
            arr[i - 1] += arr[i] / 10;
            arr[i] %= 10;
        }
        int index = arr[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        while(index < len1 + len2){
            sb.append(arr[index]);
            index++;
        }
        return sb.toString();
    }
}
