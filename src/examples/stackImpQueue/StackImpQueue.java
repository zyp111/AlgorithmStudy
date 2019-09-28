package examples.stackImpQueue;

import java.util.Stack;

public class StackImpQueue {
    private Stack data;
    private Stack temp;

    public StackImpQueue() {
        data = new Stack();
        temp = new Stack();
    }

    public void push(int num) {
        data.push(num);
    }

    //自己写法
//    public int pop() {
////        while(!data.isEmpty()) {
////            temp.push(data.pop());
////        }
////        int result = (int)temp.pop();
////        while(!temp.isEmpty()) {
////            data.push(temp.pop());
////        }
////        return result;
////    }

    //改进写法，实现过程更为简单
    public int pop() {
        if(temp.isEmpty()) {
            while(!data.isEmpty()) {
                temp.push(data.pop());
            }
        }
        return (int)temp.pop();
    }

    public boolean isEmpty() {
        if(data.isEmpty() && temp.isEmpty())
            return true;
        return false;
    }
}
