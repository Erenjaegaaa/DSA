import java.util.Scanner;

public class Queueeq {

    int front, rear;
    int capacity;
    int[] queue;

    Queueeq(int capacity) {
        this.capacity = capacity;
        front = rear = -1;
        queue = new int[capacity];
    }

    // enqueue
    void eq(int data) {
        if (rear == capacity - 1) {
            System.out.println("queue full");
            return;
        }

        if (front == -1) {   // first insertion
            front = 0;
        }

        rear++;
        queue[rear] = data;
    }

    // dequeue
    void deq() {
        if (front == -1 || front > rear) {
            System.out.println("queue empty");
            front = rear = -1;
            return;
        }

        front++;

        // reset when queue becomes empty
        if (front > rear) {
            front = rear = -1;
        }
    }

    // traversal
    void traverse() {
        if (front == -1) {
            System.out.println("queue empty");
            return;
        }

        System.out.print("queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter capacity: ");
        int capacity = sc.nextInt();

        Queueeq q = new Queueeq(capacity);

        q.eq(10);
        q.eq(20);
        q.eq(30);
        q.traverse();

        q.deq();
        q.traverse();

        q.deq();
        q.traverse();

        q.deq();
        q.traverse();

        q.eq(50);
        q.traverse();
    }
}
