package Text2;

public class text {
    public static void main(String[] args) {
        String ransomNote = "luoaabccd";
        String magazine = "abcdabcdluo";
        Solution s = new Solution();
        boolean result = s.canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}
