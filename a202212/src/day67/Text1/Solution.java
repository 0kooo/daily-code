package day67.Text1;

class Solution {
    public int beautySum(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            int[] count = new int[26];
            count[cs[i] - 'a']++;
            int max = 1;
            int min = 600;
            int pos = -1;
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, ++count[cs[j] - 'a']);
                if(count[cs[j] - 'a'] == 1){
                    min = 1;
                    pos = cs[j] - 'a';
                }else if(pos == -1 || pos == cs[j] - 'a'){
                    min++;
                    for (int k = 0; k < 26; k++) {
                        if(count[k] != 0 && count[k] < min){
                            min = count[k];
                            pos = k;
                        }
                    }
                }
                res += max - min;
            }
        }
        return res;
    }
}
