package day283.Test2;

//168. Excel表列名称
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0){
            int flag = (columnNumber - 1) % 26 + 1;
            sb.append((char)(flag + 'A' - 1));
            columnNumber = (columnNumber - flag) / 26;
        }
        return sb.reverse().toString();
    }
}
