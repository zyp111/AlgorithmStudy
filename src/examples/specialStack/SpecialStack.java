package examples.specialStack;

import java.util.Stack;

public class SpecialStack {
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> min = new Stack<>();
    private int minNum = Integer.MAX_VALUE;

    public void push(int num) {
        data.push(num);
        if(minNum > num)
            minNum = num;
        min.push(minNum);
    }

    public int pop() {
        min.pop();
        if(!min.isEmpty()) {
            minNum = min.peek();
        }
        return data.pop();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int getMinNum() {
        return minNum;
    }
}
