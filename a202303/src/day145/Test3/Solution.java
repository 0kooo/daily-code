package day145.Test3;

class Solution {
    public String getHint(String secret, String guess) {
        int countA = 0;
        int countB = 0;
        int[] arrS = new int[10];
        int[] arrG = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if(c2 == c1) countA++;
            else{
                ++arrS[c1 - '0'];
                ++arrG[c2 - '0'];
            }
        }
        for (int i = 0; i < 10; i++) {
            countB += Math.min(arrS[i], arrG[i]);
        }
        StringBuilder res = new StringBuilder();
        res.append(countA).append("A").append(countB).append("B");
        return res.toString();
    }
}
