package day87.Text1;

class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        char res = ' ';
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a';
            arr[num]++;
            if(arr[num] == 2){
                res = s.charAt(i);
                break;
            }
        }
        return res;
    }
}
