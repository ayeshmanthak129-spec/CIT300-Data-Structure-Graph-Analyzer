package analyzer;

public class QueueOperations {

    private final int[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueOperations() {
        queue = new int[100];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return false;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;

        System.out.println("Enqueued: " + value);
        return true;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        System.out.println("Dequeued: " + value);
        return value;
    }

    public Integer peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue (front to rear): ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }

        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int getSize() {
        return size;
    }
}