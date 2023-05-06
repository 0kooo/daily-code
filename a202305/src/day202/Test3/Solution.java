package day202.Test3;

//1700. 无法吃午餐的学生数量
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int res = 0;
        for (int i = 0; i < sandwiches.length; ) {
            boolean falg = true;
            for (int j = 0; j < students.length; j++) {
                if(sandwiches[i] == students[j]){
                    students[j] = 2;
                    i++;
                    falg = false;
                    break;
                }
            }
            if(falg)break;
        }
        for (int student : students) {
            if(student != 2) res++;
        }
        return res;
    }
}
