package day122.Text3;


class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while(i < j){
            while(i < n && !dfs(chars[i])){
                i++;
            }
            while(j > 0 && !dfs(chars[j])){
                j--;
            }
            if(i < j){
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public boolean dfs(char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    public void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
