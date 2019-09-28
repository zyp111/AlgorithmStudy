package examples.arrayImpStack;

public class ArratStackTest {
    public static void main(String[] args) {  //simply test
        ArrayImpStack stack = new ArrayImpStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
