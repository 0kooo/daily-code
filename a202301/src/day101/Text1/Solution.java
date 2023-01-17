package day101.Text1;

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] news1 = sentence1.split(" ");
        String[] news2 = sentence2.split(" ");
        int i = 0;
        int j = 0;
        while(i < news1.length && i < news2.length && news1[i].equals(news2[i])){
            i++;
        }
        while(j < news1.length - i && j < news2.length - i && news1[news1.length - j - 1].equals(news2[news2.length - j - 1])){
            j++;
        }
        return i + j == Math.min(news1.length, news2.length);
    }
}
