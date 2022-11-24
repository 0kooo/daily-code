package text2;

public class text {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution s = new Solution();
        int k = s.removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}
