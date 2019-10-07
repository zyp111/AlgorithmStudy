package dataStruct.stcak;

import java.util.ArrayList;

public class MyStack {
    //考虑栈结构都是栈顶存取，这里采用数组实现
    private int stackMax = 100;
    private int[] stack = new int[stackMax];
    private int top = 0;
    public void push(int num) {
        stack[top] = num;
        top++;
    }
    public int peek() {
        return stack[top - 1];
    }
    public int pop() {
        return stack[--top];
    }
    public boolean isEmpty() {
        return top == 0;
    }
}
