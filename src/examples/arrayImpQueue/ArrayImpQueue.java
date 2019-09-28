package examples.arrayImpQueue;

public class ArrayImpQueue {
    private int initailLength = 10;
    private int[] array = new int[initailLength];
    private int start = 0;
    private int end = 0;
    private int queueSize = 0;

    public void push(int num) {
        if(queueSize == initailLength)
            throw new ArrayIndexOutOfBoundsException("Error! There is no space");
        array[end] = num;
        if(end != 9) end++;
        else end = 0;
        queueSize++;
    }

    public int pop() {
        if(queueSize == 0)
            throw new ArrayIndexOutOfBoundsException("Error! There is nothing in this queue");
        int result = array[start];
        if(start != 9) start++;
        else start = 0;
        queueSize--;
        return result;
    }

    public boolean isEmpty() {
        return (queueSize == 0) ? true : false;
    }

    public void printArray() {
        for(int i = 0; i < initailLength; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public void printQueue() {
        for(int i = start; i < end; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
