package day161.Test2;

//1332. 删除回文子序列
class Solution {
    public int removePalindromeSub(String s) {
       int i = 0, j = s.length() - 1;
       while (i < j){
           if(s.charAt(i) != s.charAt(j)){
               return 2;
           }
           i++;
           j--;
       }
       return 1;
    }
}
