package day55.Text2;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        if(target >= letters[length - 1]){
            return letters[0];
        }
        int left = 0;
        int right = length - 1;
        while(left < right){
            int mid = ((right - left) >> 1) + left;
            if(letters[mid] > target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return letters[left];
    }
}
