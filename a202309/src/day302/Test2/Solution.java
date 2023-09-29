package day302.Test2;

//2129. 将标题首字母大写
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String []temp = title.split(" ");
        for(String s : temp)
        {
            if(s.length() < 3)
            {
                sb.append(s.toLowerCase()).append(" ");
            }
            else
            {
                sb.append(String.valueOf(s.charAt(0)+"").toUpperCase()+s.substring(1,s.length()).toLowerCase()).append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
