package Text1;

public class text {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        //towSum(nums,target);
        Solution s = new Solution();
        int[] result = s.towSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
