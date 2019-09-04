package sort;

public class SelectionSort {
    public static void swap(int[] arr, int m, int n) {
        if(m == n) return;
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }
        int min;
        for(int i = 0; i < arr.length - 1; i++) {
            int minDex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minDex]) {
                    minDex = j;
                }
            }
            swap(arr, i, minDex);
        }
    }
}
