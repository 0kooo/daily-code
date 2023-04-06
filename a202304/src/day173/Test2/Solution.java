package day173.Test2;


//1275. 找出井字棋的获胜者
class Solution {
    public String tictactoe(int[][] moves) {
        int m = moves.length;
        int[] arr = new int[8];
        for(int i = m - 1; i >= 0; i -= 2){
            arr[moves[i][0]]++;
            arr[moves[i][1] + 3]++;
            if(moves[i][0] == moves[i][1]) arr[6]++;
            if(moves[i][0] + moves[i][1] == 2) arr[7]++;
            if(arr[moves[i][0]] == 3 || arr[moves[i][1] + 3] == 3 || arr[6] == 3 || arr[7] == 3){
                return m % 2 == 0 ? "B" : "A";
            }
        }
        if(m < 9) return "Pending";
        return "Draw";
    }
}
