import java.util.Stack;

public class SQueue {

    Stack stack1;
    Stack stack2;

    // Queue - First in first out data structure (FIFO)
    // Stack - Last in first out data structure

    /**
     * Here the objective is to implement a queue data structure with 2 stacks -- see enqueue and dequeue methods
     */

    public SQueue() {

    }

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int x = (int) stack2.pop();
        return x;
    }


}
