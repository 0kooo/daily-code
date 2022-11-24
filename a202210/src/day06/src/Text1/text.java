package Text1;

public class text {
    public static void main(String[] args) {
        int[][] mat = {{1, 2},{3,4}};
        int r = 1;
        int c = 4;
        Solution s = new Solution();
        int[][] res = s.matrixReshape(mat, r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
