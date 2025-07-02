package DataStructures;

public class Queue {
    int[] arr;
    int front, back;
    int size;

    // Constructor
    Queue(int n) {
        size = n;
        front = 0;
        back = -1;
        arr = new int[size];
    }

    // Push element into queue
    void push(int x) {
        if (back == size - 1) {
            System.out.println("Overflow");
            return;
        }
        back++;
        arr[back] = x;
    }

    // Pop element from queue
    int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front++];
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front > back;
    }

    // Optional: Peek front element
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Optional: Print queue elements
    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= back; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Test the queue
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.push(10);
        q.push(20);
        q.push(30);
        q.printQueue();

        System.out.println("Popped: " + q.pop());
        q.printQueue();

        System.out.println("Front: " + q.peek());
        System.out.println("Is Empty? " + q.isEmpty());
    }
}
