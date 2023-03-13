package day149.Test1;

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = 0;
        for (int i : energy) {
            sum += i;
        }
        int ret = initialEnergy > sum ? 0 : sum - initialEnergy + 1;
        for (int i : experience) {
            if(i >= initialExperience){
                ret += i - initialExperience + 1;
                initialExperience = 2 * i + 1;
            }
            else initialExperience += i;
        }
        return ret;
    }
}
