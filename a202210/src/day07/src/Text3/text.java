package Text3;

public class text {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,1};
        int n = 2;
        Solution s = new Solution();
        boolean b = s.canPlaceFlowers(flowerbed, n);
        System.out.println(b);
    }
}
