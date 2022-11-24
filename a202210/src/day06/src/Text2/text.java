package Text2;

import java.util.List;

public class text {
    public static void main(String[] args) {
        int numRows = 5;
        Solution s = new Solution();
        List<List<Integer>> generate = s.generate(5);
        System.out.println(generate);
    }
}
