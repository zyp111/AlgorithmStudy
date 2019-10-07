package dataStruct.queue;

public class MyQueue {
    //链表实现队列
    Qnode front, rear;
    public MyQueue() {
        front = new Qnode();
        front.next = null;
        rear = front;
    }
    public void push(int num) {
        Qnode p = new Qnode();
        p.data = num;
        p.next = null;
        rear.next = p;
        rear = p;
    }
    public int pop() {
        int result = front.next.data;
        front.next = front.next.next;
        return result;
    }
    public boolean isEmpty() {
        return rear == front;
    }
}
