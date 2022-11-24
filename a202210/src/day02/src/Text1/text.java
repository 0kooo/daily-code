package Text1;

import java.util.Arrays;

public class text {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = nums1.length;
        int n = nums2.length;
        Solution s = new Solution();
        s.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
