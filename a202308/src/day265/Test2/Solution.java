package day265.Test2;

//2748. 美丽下标对的数目
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int res = 0;
        int[] arr = new int[10];
        for (int x : nums) {
            for (int y = 1; y < 10; y++)
                if(arr[y] > 0 && gcd(x % 10, y) == 1){
                    res += arr[y];
                }
            while (x >= 10) x /= 10;
            arr[x]++;
        }
        return res;
    }

    private int gcd(int x, int y) {
        while (x != 0){
            int temp = x;
            x = y % x;
            y = temp;
        }
        return y;
    }
}
