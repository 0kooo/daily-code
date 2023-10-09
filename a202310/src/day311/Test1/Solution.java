package day311.Test1;

//1103. 分糖果 II
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 1, index = 0;
        for (;;){
            if(index == num_people) index = 0;
            if(candies == 0)break;
            if(candies < i){
                res[index] = res[index] + candies;
                candies = 0;
            }else{
                res[index] = res[index] + i;
                candies -= i;
                i++;
                index++;
            }
        }
        return res;
    }
}
