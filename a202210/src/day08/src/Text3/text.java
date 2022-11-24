package Text3;

public class text {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Solution su = new Solution();
        boolean result = su.isAnagram(s, t);
        System.out.println(result);
    }
}
