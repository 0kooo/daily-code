package day332.Test1;

//537. 复数乘法
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        String[] arr1 = num1.split("\\+|i");
        String[] arr2 = num2.split("\\+|i");
        int real1 = Integer.parseInt(arr1[0]);
        int real2 = Integer.parseInt(arr2[0]);
        int imag1 = Integer.parseInt(arr1[1]);
        int imag2 = Integer.parseInt(arr2[1]);
        return String.format("%d+%di", real1 * real2 - imag1 * imag2, real1 * imag2 + imag1 * real2);
    }
}