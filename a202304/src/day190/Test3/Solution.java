package day190.Test3;

//2103. 环和杆
class Solution {
    public int countPoints(String rings) {
        int res = 0;
        int[][] arr = new int[10][3];
        for (int i = 0; i < rings.length(); i = i+2) {
            char c1 = rings.charAt(i);
            char c2 = rings.charAt(i + 1);
            switch (c1) {
                case 'R' -> {
                    arr[c2 - '0'][0]++;
                    break;
                }
                case 'G' -> {
                    arr[c2 - '0'][1]++;
                    break;
                }
                case 'B' -> {
                    arr[c2 - '0'][2]++;
                    break;
                }
            }
        }
        for (int[] a : arr) {
            if(a[0] > 0 && a[1] > 0 && a[2] > 0) res++;
        }
        return res;
    }
}
