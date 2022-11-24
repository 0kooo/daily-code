package Text2;

class Solution {
    public int nextGreaterElement(int n) {
        int x1 = n, count1 = 1;
        for(; x1 >= 10 && x1 / 10 % 10 >= x1 % 10; x1 /= 10){
            ++count1;
        }
        x1 /= 10;
        if(x1 == 0){
            return -1;
        }
        int target = x1 % 10;
        int x2 = n, count2 = 0;
        for(; x2 % 10 <= target; x2 /= 10){
            ++count2;
        }
        x1 += x2 % 10 - target;
        for (int i = 0; i < count1; i++, n /= 10) {
            int d = i != count2 ? n % 10 : target;
            if(x1 > Integer.MAX_VALUE / 10 || x1 == Integer.MAX_VALUE / 10 && d > 7){
                return -1;
            }
            x1 = x1 * 10 + d;
        }
        return x1;
    }
}
