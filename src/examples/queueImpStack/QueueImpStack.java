package examples.queueImpStack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImpStack {
    private Queue<Integer> data;
    private Queue<Integer> temp;

    public QueueImpStack() {
        data = new LinkedList<Integer>();
        temp = new LinkedList<Integer>();
    }

    public void push(int num) {
        data.add(num);
    }

    public int pop() {
        if(data.size() == 1)
            return data.poll();
        while(data.size() > 1) {
            temp.add(data.poll());
        }
        int result = data.poll();
//        while(temp.size() > 0) {
//            data.add(temp.poll());
//        }
        Queue<Integer> swap = data;
        data = temp;
        temp = swap;
        return result;
    }

    public boolean isEmpty() {
        if(data.size() == 0)
            return true;
        return false;
    }
}
