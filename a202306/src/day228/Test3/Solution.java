package day228.Test3;

//2303. 计算应缴税款总额
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double res = 0.0;
        int low = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0], percent = bracket[1];
            int tax = (Math.min(upper, income) - low) * percent;
            res += tax;
            if(upper >= income) break;
            low = upper;
        }
        return (double) res / 100.0;
    }
}
