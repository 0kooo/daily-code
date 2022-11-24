package Text2;

import java.util.Set;

class Solution {
    public double average(int[] salary) {
        int length = salary.length;
        int max = salary[0];
        int min = salary[0];
        for (int k : salary) {
            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
        double sum = 0.0;
        for (int j : salary) {
            sum += j;
        }
        return (sum - max - min) / (length - 2);
    }
}
