package Stack;

public class TwoStacks {
    int size;
    int top1, top2;
    int[] arr;

    // Constructor
    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    // Push to Stack 1
    public void push1(int x) {
        if (top1 + 1 < top2) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow in Stack 1");
        }
    }

    // Push to Stack 2
    public void push2(int x) {
        if (top1 + 1 < top2) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow in Stack 2");
        }
    }

    // Pop from Stack 1
    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow in Stack 1");
            return -1;
        }
    }

    // Pop from Stack 2
    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow in Stack 2");
            return -1;
        }
    }

    // Optional: print current state
    public void printStacks() {
        System.out.print("Stack1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nStack2: ");
        for (int i = size - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.push1(1);
        ts.push1(2);
        ts.push2(9);
        ts.push2(8);
        ts.printStacks();

        System.out.println("Popped from Stack1: " + ts.pop1());
        System.out.println("Popped from Stack2: " + ts.pop2());
        ts.printStacks();
    }
}
