package dataStruct.queue;

public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        while(!myQueue.isEmpty()) {
            System.out.println(myQueue.pop());
        }
    }
}
