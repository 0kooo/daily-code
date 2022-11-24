package Text2;

class MyCircularQueue {

    private int head;
    private int end;
    private int[] arr;
    private int len;
    public MyCircularQueue(int k) {
        len = k + 1;
        arr = new int[len];
        head = end = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        arr[end] = value;
        end = (end + 1) % len;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        head = (head + 1) % len;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[head];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(end - 1 + len) % len];
    }

    public boolean isEmpty() {
        return head == end;
    }

    public boolean isFull() {
        return ((end + 1) % len) == head;
    }
}
