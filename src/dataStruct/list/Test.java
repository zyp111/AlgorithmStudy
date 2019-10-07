package dataStruct.list;

public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(20);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(4);
        myArrayList.print();
        myArrayList.update(1,9);
        myArrayList.print();
        myArrayList.delete(0);
        myArrayList.print();

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList.get(1));
        myLinkedList.print();
        myLinkedList.remove(1);
        myLinkedList.print();
    }
}
