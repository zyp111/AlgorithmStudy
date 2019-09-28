package examples.arrayImpStack;

public class ArrayImpStack {
    private int[] stack = new int[10];
    private int top;

    public ArrayImpStack() {
        this.top = 0;
    }

    public void push(int num) {
        if(top > (stack.length - 1)){
            throw new ArrayIndexOutOfBoundsException("There is no enough space");
        } else {
            stack[top++] = num;
        }
    }

    public int pop() {
        if(top == 0) {
            throw new ArrayIndexOutOfBoundsException("The stack is empty now.");
        } else {
            return stack[--top];
        }
    }

    public boolean isEmpty() {
        if(top == 0) return true;
        return false;
    }
}
