package day140.Text3;

class Solution {
    public int numSquares(int n) {
        if(isPerfectSquare(n)){
            return 1;
        }
        if(checkAnswer4(n)){
            return 4;
        }
        for (int i = 1; i * i <= n; i++) {
            int j = n - i * i;
            if(isPerfectSquare(j)){
                return 2;
            }
        }
        return 3;
    }
    public boolean isPerfectSquare(int x){
        int y = (int) Math.sqrt(x);
        return y * y == x;
    }

    public boolean checkAnswer4(int x){
        while(x % 4 == 0){
            x /= 4;
        }
        return x % 8 == 7;
    }
}
