package Text2;

public class text {
    public static void main(String[] args) {
        //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-1};
        Solution s = new Solution();
        int maxNumber = s.maxSubArray(nums);
        System.out.println(maxNumber);
    }
}
