package day240.Test1;

import java.util.ArrayList;
import java.util.List;

//784. 字母大小写全排列
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        dfs(s.toCharArray(), 0, res);
        return res;
    }

    private void dfs(char[] arr, int index, List<String> res) {
        while (index < arr.length && Character.isDigit(arr[index])){
            index++;
        }
        if(index == arr.length){
            res.add(new String(arr));
            return;
        }
        arr[index] ^= 32;
        dfs(arr, index + 1, res);
        arr[index] ^= 32;
        dfs(arr, index + 1, res);
    }
}
