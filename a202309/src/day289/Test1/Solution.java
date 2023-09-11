package day289.Test1;

import java.util.Arrays;
import java.util.PriorityQueue;

//630. 课程表 III
class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        int total = 0;
        for (int[] cours : courses) {
            int ti = cours[0], di = cours[1];
            if(total + ti <= di){
                total += ti;
                q.offer(ti);
            }else if(!q.isEmpty() && q.peek() > ti){
                total -= q.poll() - ti;
                q.offer(ti);
            }
        }
        return q.size();
    }
}
