package examples.stackImpQueue;

public class StackQueueTest {
    public static void main(String[] args) {
        StackImpQueue queue = new StackImpQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        while(!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }
}
