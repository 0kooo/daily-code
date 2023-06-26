package day242.Test4;

//1816. 截断句子
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++){
            if(i == k - 1) res.append(arr[i]);
            else res.append(arr[i]).append(" ");
        }
        return res.toString();
    }
}
