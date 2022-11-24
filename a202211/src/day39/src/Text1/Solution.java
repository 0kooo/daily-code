package Text1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] subordinatesArr = new List[n];
        for (int i = 0; i < n; i++) {
            subordinatesArr[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            if(i != headID){
                subordinatesArr[manager[i]].add(i);
            }
        }
        int maxTime = 0;
        Queue<int[]> stack = new LinkedList<>();
        stack.offer(new int[]{headID, 0});
        while(!stack.isEmpty()){
            int[] employee = stack.poll();
            int id = employee[0];
            int time = employee[1];
            maxTime = Math.max(maxTime, time);
            List<Integer> subordinates = subordinatesArr[id];
            int nextTime = time + informTime[id];
            for (Integer subordinate : subordinates) {
                stack.offer(new int[]{subordinate, nextTime});
            }
        }
        return maxTime;
    }
}
