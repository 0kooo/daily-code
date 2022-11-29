package day54.Text3;

class Solution {
    public int minOperations(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]){
                count++;
                if(arr[i] == '0'){
                    arr[i + 1] = '1';
                }else{
                    arr[i + 1] = '0';
                }
            }
        }
        return count;
    }
}
