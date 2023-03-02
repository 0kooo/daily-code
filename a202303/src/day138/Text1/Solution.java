package day138.Text1;

class Solution {
    public String printBin(double num) {
        StringBuilder res = new StringBuilder("0.");
        while(res.length() <= 32 && num != 0){
            num *= 2;
            int n = (int)num;
            res.append(n);
            num -= n;
        }
        return res.length() <= 32 ? res.toString() : "ERROR";
    }
}
