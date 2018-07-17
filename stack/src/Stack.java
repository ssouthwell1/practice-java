import java.util.Queue;

public class Stack {

    Queue queue1;
    Queue queue2;

    public void push(int value) {
        queue1.add(value);
    }

    public Object pop() {
        if (queue2.isEmpty()) {
            while (!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }
        }
        Object x = queue2.remove();
        return x;
    }


}
