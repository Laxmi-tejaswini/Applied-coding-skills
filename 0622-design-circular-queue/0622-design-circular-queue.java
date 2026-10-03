class MyCircularQueue {
    int[] q;
    int F, r;
    int size;
    int capacity;
    public MyCircularQueue(int k) {
        q = new int[k];
        capacity = k;
        F = r = -1;
        size = 0;
    }
    public boolean enQueue(int value) {
        if (isFull())
            return false;
        if (isEmpty()) {
            F = r = 0;
        } else {
            r = (r + 1) % capacity;
        }
        q[r] = value;
        size++;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty())
            return false;
        if (F == r) {
            F = r = -1;
        } else {
            F = (F + 1) % capacity;
        }
        size--;
        return true;
    }
    public int Front() {
        if (isEmpty())
            return -1;
        return q[F];
    }
    public int Rear() {
        if (isEmpty())
            return -1;
        return q[r];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
}