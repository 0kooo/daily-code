package Text1;

class Solution {
    public int countOdds(int low, int high) {
        return pre(high) - pre(low - 1);
    }
    public int pre(int x){
        return (x + 1) >> 1;
    }
}
