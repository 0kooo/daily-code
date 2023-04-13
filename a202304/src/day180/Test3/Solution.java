package day180.Test3;

//1684. 统计一致字符串的数目
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr1 = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            arr1[allowed.charAt(i) - 'a']++;
        }
        int res = 0;
        for (String word : words) {
            int[] arr2 = new int[26];
            for (int i = 0; i < word.length(); i++) {
                arr2[word.charAt(i) - 'a']++;
            }
            boolean flag = true;
            //System.out.println("---------------");
            for (int i = 0; i < 26; i++) {
                //System.out.println(arr1[i] + " " + arr2[i]);
                if(arr2[i] != 0 && arr1[i] == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) res++;
        }
        return res;
    }
}
