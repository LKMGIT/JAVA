package interfacetest;

public class MyQueue implements Queue {

    private int front = 0;
    private int back = 0;
    private int[] queue;

    public MyQueue(int size) {
        queue = new int[size];
    }

    @Override
    public void enqueue(int val) {
        if (back == queue.length) {
            int newSize = queue.length * 2;
            int[] newQueue = new int[newSize];
            for (int i = front; i < back; i++) {
                newQueue[i - front] = queue[i];
            }
            back = back - front;
            front = 0;
            queue = newQueue;
        }

        queue[back++] = val;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어 있습니다.");
            return -1;
        }
        return queue[front++];
    }

    @Override
    public boolean isEmpty() {
        return front == back;
    }

    public void printQueue() {
        System.out.print("Queue = ");
        for (int i = front; i < back; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(3);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.printQueue();

        q.enqueue(4); 
        q.enqueue(5);
        q.printQueue();

        System.out.println("dequeue: " + q.dequeue());
        q.printQueue();
    }
}
