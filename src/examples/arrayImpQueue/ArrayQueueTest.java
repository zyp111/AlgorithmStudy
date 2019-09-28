package examples.arrayImpQueue;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayImpQueue arrayImpQueue = new ArrayImpQueue();
        arrayImpQueue.push(1);
        arrayImpQueue.push(2);
        arrayImpQueue.push(3);
        arrayImpQueue.printArray();
        arrayImpQueue.printQueue();
        System.out.println(arrayImpQueue.isEmpty());
        while(!arrayImpQueue.isEmpty()) {
            System.out.println(arrayImpQueue.pop());
        }
    }
}
