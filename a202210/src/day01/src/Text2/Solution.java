package Text2;

class Solution {
    public boolean isPalindrome(int x) {
        /*if(x < 0){
            return false;
        }
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;
        if(s.charAt(right) == '0'){
            return false;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;*/
        int temp = x;
        if(x < 0){
            return false;
        }
        int count = 1;
        int number = 0;
        while(x > 0){
            int ge = x % 10;
            if(count == 1 && ge == 0){
                return false;
            }
            count++;
            x = (x - ge) / 10;
            number = number * 10 + ge;
        }
        if(number == temp){
            return true;
        }else{
            return false;
        }
    }
}
