package day366.Test3;

//2833. 距离原点最远的点
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int[] arr = new int[3];
        for (char c : moves.toCharArray()) {
            if(c == 'L') arr[0]++;
            else if(c == 'R') arr[2]++;
            else arr[1]++;
        }
        return arr[0] > arr[2] ? arr[0] + arr[1] - arr[2] : arr[2] + arr[1] - arr[0];
    }
}