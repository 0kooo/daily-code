package day54.Text2;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr2.length; j++) {
                int num = arr1[i] - arr2[j];
                if(num < 0){
                    num *= -1;
                }
                if(num != d) {
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}
