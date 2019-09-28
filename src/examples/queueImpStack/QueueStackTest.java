package examples.queueImpStack;

public class QueueStackTest {
    public static void main(String[] args) {
        QueueImpStack stack = new QueueImpStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
