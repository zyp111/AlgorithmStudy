package dataStruct.stcak;

public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());
        while(!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
