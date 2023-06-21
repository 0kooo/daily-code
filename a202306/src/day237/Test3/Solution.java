package day237.Test3;

//1013. 将数组分成和相等的三个部分
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0, cur = 0, n = arr.length;
        for (int i : arr) {
            sum += i;
        }
        if(sum % 3 != 0) return false;
        int i = 0, target = sum / 3;
        while (i < n){
            cur += arr[i];
            if(cur == target) break;
            i++;
        }
        if(cur != target) return false;
        int j = i + 1;
        while (j + 1 < n){
            cur += arr[j];
            if(cur == target * 2) return true;
            j++;
        }
        return false;
    }
}