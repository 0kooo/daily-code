package Text1;

public class text {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Solution s = new Solution();
        int[] rseult = s.intersect(nums1, nums2);
        for (int i = 0; i < rseult.length; i++) {
            System.out.print(rseult[i] + " ");
        }
    }
}
