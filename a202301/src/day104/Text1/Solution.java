package day104.Text1;

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if(n < 8) return false;
        boolean big = true;
        boolean small = true;
        boolean number = true;
        boolean sp = true;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(c >= 'A' && c <= 'Z') big = false;
            else if(c >= 'a' && c <= 'z') small = false;
            else if(c >= '0' && c <= '9') number = false;
            else sp = false;
        }
        if(big || sp || small || number) return false;
        for (int i = 0; i < password.length() - 1; i++) {
            if(password.charAt(i) == password.charAt(i + 1))return false;
        }
        return true;
    }
}
/*
* class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String re = "(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*()\\-+])(?!.*(.)\\1+).{8,}";

        return password.matches(re);
    }
}*/