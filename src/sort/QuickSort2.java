package sort;

public class QuickSort2 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if(arr == null || end <= begin) {
            return;
        }
        int i = begin;
        int j = end;
        int base = arr[begin];
        while(i < j) {
            while(i < j && arr[j] >= base) {
                j--;
            }
            while(i < j && arr[i] <= base) {
                i++;
            }
            if(i < j)
                swap(arr,i,j);
        }
        arr[begin] = arr[i];
        arr[i] = base;
        quickSort(arr,begin, i-1);
        quickSort(arr,i+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {6,2,7,3,8,9};
        quickSort(arr,0, 5);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
