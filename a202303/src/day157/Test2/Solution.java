package day157.Test2;

//917. 仅仅反转字母
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while(left < right){
            while(left < right && !(Character.isLetter(arr[left]))){
                left++;
            }
            while(right > left && !(Character.isLetter(arr[right]))){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        /*StringBuilder ans = new StringBuilder();
        for (char c : arr) {
            ans.append(c);
        }*/
        return new String(arr);
    }
}
