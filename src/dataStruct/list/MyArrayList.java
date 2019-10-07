package dataStruct.list;

public class MyArrayList {
    private int startSize = 10;
    private int[] arr;
    private int length = 0;

    public MyArrayList() {
        arr = new int[startSize];
    }
    public MyArrayList(int startSize) {
        this.startSize = startSize;
        arr = new int[startSize];
    }

    public void add(int i) {
        if(this.length == 10)
            throw new ArrayIndexOutOfBoundsException("there is no space");
        arr[length] = i;
        length ++;
    }

    public void delete(int index) {
        if(index > (length - 1))
            throw new RuntimeException("index is too big");
        if(index == length - 1) {
            length --;
            return;
        }
        for(int i = index; i < length; i++) {
            arr[i] = arr[i + 1];
        }
        length--;
    }

    public void update(int index, int num) {
        if(index > (length - 1))
            throw new RuntimeException("index is too big");
        arr[index] = num;
    }

    public boolean isEmpty() {
        if(length == 0)
            return true;
        return false;
    }

    public void print() {
        System.out.print("[");
        for(int i = 0; i < length; i++) {
            if(i == length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ",");
        }
        System.out.print("]");
    }
}
