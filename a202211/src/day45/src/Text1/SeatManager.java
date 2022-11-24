package Text1;

import java.util.PriorityQueue;
import java.util.Queue;

class SeatManager {
    /*private int[] arr;
    public SeatManager(int n) {
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public int reserve() {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                res = arr[i];
                arr[i] = 0;
                break;
            }
        }
        return res;
    }

    public void unreserve(int seatNumber) {
        arr[seatNumber - 1] = seatNumber;
    }*/
    PriorityQueue<Integer> stack;
    int i = 1;
    public SeatManager(int n) {
        stack = new PriorityQueue<>();
    }

    public int reserve() {
        if(!stack.isEmpty()) return stack.poll();
        else return i++;
    }

    public void unreserve(int seatNumber) {
        stack.add(seatNumber);
    }
}
