package day57.Text3;

class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if(boxes.charAt(j) == '1'){
                    count = count + Math.abs(i - j);
                }
            }
            res[i] = count;
        }
        return res;
    }
}
