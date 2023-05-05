package day201.Test3;

//1598. 文件夹操作日志搜集器
class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for (String log : logs) {
            if(log.equals("../")){
                if(res > 0){
                    res--;
                }
            }else if(log.equals("./")){
            }else{
                res++;
            }
        }
        return res;
    }
}
