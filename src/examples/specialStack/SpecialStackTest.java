package examples.specialStack;

public class SpecialStackTest {
    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();
        specialStack.push(1);
        System.out.println(specialStack.getMinNum());
        specialStack.push(0);
        System.out.println(specialStack.getMinNum());
        specialStack.push(2);
        System.out.println(specialStack.getMinNum());
        while (!specialStack.isEmpty()) {
            System.out.println(specialStack.pop());
            System.out.println(specialStack.getMinNum());
        }
    }
}
