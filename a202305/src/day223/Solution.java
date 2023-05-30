package day223;

//1442. 形成两个异或相等数组的三元组数目
class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] ^ arr[i];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if(s[i] == s[k + 1]){
                    res += k - i;
                }
            }
        }
        return res;
    }
}
