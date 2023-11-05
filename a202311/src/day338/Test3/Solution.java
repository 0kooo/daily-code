package day338.Test3;

//1507. 转变日期格式
class Solution {
    public String reformatDate(String date) {
        String[] Moth = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] s = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(s[2]);
        sb.append("-");
        for (int i = 0; i < Moth.length; i++) {
            if(Moth[i].equals(s[1])){
                if(i + 1 <= 9) sb.append(0);
                sb.append(i + 1);
            }
        }
        sb.append("-");
        if(s[0].length() == 4){
            sb.append(s[0].charAt(0));
            sb.append(s[0].charAt(1));
        }else{
            sb.append(0);
            sb.append(s[0].charAt(0));
        }
        return sb.toString();
    }
}
