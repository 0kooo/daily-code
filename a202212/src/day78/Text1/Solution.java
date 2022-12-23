package day78.Text1;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations) {
            char c = operation.charAt(1);
            if(c == '-'){
                --res;
            }else{
                ++res;
            }
        }
        return res;
    }
}