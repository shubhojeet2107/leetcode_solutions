class MyCircularDeque {
    int[] deque;
    int front;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        deque = new int[k];
        front = 0;
        size = 0;
        capacity = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;

        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        int last = (front + size) % capacity;
        deque[last] = value;
        size++;

        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        front = (front + 1) % capacity;
        size--;

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        size--;

        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;

        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;

        int last = (front + size - 1) % capacity;
        return deque[last];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
