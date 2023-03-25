package day161.Test3;

//2000. 反转单词前缀
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c == ch) {
                index = i;
                break;
            }
        }
        int i = 0;
        while(i < index){
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            i++;
            index--;
        }
        return new String(arr);
    }
}
