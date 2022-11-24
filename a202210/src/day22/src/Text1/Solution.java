package Text1;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int rCount = n - i - 1;
            int lOdd = (i + 1) / 2;
            int rOdd = (rCount + 1) / 2;
            int le = i / 2 + 1;
            int re = rCount / 2 + 1;
            sum += arr[i] * (lOdd * rOdd + le * re);
        }
        return sum;
    }
}
