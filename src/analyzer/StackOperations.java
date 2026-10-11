package analyzer;

public class StackOperations {

    private final int[] stack;
    private int top;

    public StackOperations() {
        stack = new int[100];
        top = -1;
    }

    public boolean push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
            return false;
        }

        stack[++top] = value;
        System.out.println("Pushed: " + value);
        return true;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        int value = stack[top--];
        System.out.println("Popped: " + value);
        return value;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack (top to bottom): ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int getSize() {
        return top + 1;
    }
}