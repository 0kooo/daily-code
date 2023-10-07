package day309.Test4;

//1592. 重新排列单词间的空格
class Solution {
    public String reorderSpaces(String text) {
        int length = text.length();
        String[] words = text.trim().split("\\s+");
        int cntSpace = length;
        for (String word : words) {
            cntSpace -= word.length();
        }
        StringBuilder res = new StringBuilder();
        if(words.length == 1){
            res.append(words[0]);
            for (int i = 0; i < cntSpace; i++) {
                res.append(' ');
            }
            return res.toString();
        }
        int perSpace = cntSpace / (words.length - 1);
        int pestSpace = cntSpace % (words.length - 1);
        for (int i = 0; i < words.length; i++) {
            if(i > 0){
                for (int j = 0; j < perSpace; j++) {
                    res.append(" ");
                }
            }
            res.append(words[i]);
        }
        for (int i = 0; i < pestSpace; i++) res.append(" ");
        return res.toString();
    }
}
