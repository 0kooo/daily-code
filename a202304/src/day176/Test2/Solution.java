package day176.Test2;

//423. 从英文中重建数字
class Solution {
    public String originalDigits(String s) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[26];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr2[c - 'a']++;
        }
        arr1[0] = arr2['z' - 'a'];
        arr1[2] = arr2['w' - 'a'];
        arr1[4] = arr2['u' - 'a'];
        arr1[6] = arr2['x' - 'a'];
        arr1[8] = arr2['g' - 'a'];
        arr1[1] = arr2['o' - 'a'] - arr1[0] - arr1[2] - arr1[4];
        arr1[3] = arr2['h' - 'a'] - arr1[8];
        arr1[5] = arr2['f' - 'a'] - arr1[4];
        arr1[7] = arr2['s' - 'a'] - arr1[6];
        arr1[9] = arr2['i' - 'a'] - arr1[5] - arr1[6] - arr1[8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr1[i]; j++) {
                res.append(i);
            }
        }
        return res.toString();
    }
}
