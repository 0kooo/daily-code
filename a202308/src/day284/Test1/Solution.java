package day284.Test1;

import java.util.*;

//1654. 到家的最少跳跃次数
class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Queue<int[]> queue = new ArrayDeque<>();
        Set<Integer> visit = new HashSet<>();
        queue.offer(new int[]{0,1,0});
        visit.add(0);
        int low = 0, upper = Math.max(Arrays.stream(forbidden).max().getAsInt() + a, x) + b;
        Set<Integer> fSet = new HashSet<>();
        for (int n : forbidden) {
            fSet.add(n);
        }
        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int position = arr[0], direction = arr[1], step = arr[2];
            if(position == x) return step;
            int nextPosition = position + a;
            int nextDirection = 1;
            if (low <= nextPosition && nextPosition <= upper && !visit.contains(nextPosition * nextDirection) && !fSet.contains(nextPosition)) {
                visit.add(nextPosition * nextDirection);
                queue.offer(new int[]{nextPosition, nextDirection, step + 1});
            }
            if (direction == 1) {
                nextPosition = position - b;
                nextDirection = -1;
                if (low <= nextPosition && nextPosition <= upper && !visit.contains(nextPosition * nextDirection) && !fSet.contains(nextPosition)) {
                    visit.add(nextPosition * nextDirection);
                    queue.offer(new int[]{nextPosition, nextDirection, step + 1});
                }
            }
        }
        return -1;
    }
}
