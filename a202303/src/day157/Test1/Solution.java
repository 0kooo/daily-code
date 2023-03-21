package day157.Test1;

import java.math.BigDecimal;
import java.math.RoundingMode;

//2469. 温度转换
class Solution {
    public double[] convertTemperature(double celsius) {
        BigDecimal celsiusB = new BigDecimal(Double.toString(celsius));

        BigDecimal kelvin = celsiusB.add(BigDecimal.valueOf(273.15));
        BigDecimal fahrenheit = celsiusB.multiply(BigDecimal.valueOf(1.8)).add(BigDecimal.valueOf(32.0));

        double[] ans = new double[2];
        ans[0] = kelvin.setScale(5, RoundingMode.HALF_UP).doubleValue();
        ans[1] = fahrenheit.setScale(5, RoundingMode.HALF_UP).doubleValue();
        return ans;
    }
}
/*
class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
* */