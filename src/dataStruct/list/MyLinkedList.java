package dataStruct.list;

public class MyLinkedList {
    private Lnode head = new Lnode();
    private int size;
    public MyLinkedList() {
        head.next = null;
        size = 0;
    }
    public void add(int num) {
        Lnode p,h;
        p = new Lnode();
        p.data = num;
        p.next = null;
        h = head;
        while(h.next != null)
            h = h.next;
        h.next = p;
        size++;
    }
    public int get(int i) {
        int j = 0;
        Lnode h = head;
        while(j <= i) {
            h = h.next;
            j++;
        }
        return h.data;
    }
    public void remove(int index) {
        int i = 0;
        Lnode h = head;
        while(i < index) {
            h = h.next;
            i++;
        }
        h.next = h.next.next;
        h = null;
        size--;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void print() {
        Lnode h = head;
        System.out.print("[");
        for(int i = 0; i < size - 1; i++) {
            h = h.next;
            System.out.print(h.data + ",");
        }
        System.out.print(h.next.data + "]");
    }
}
