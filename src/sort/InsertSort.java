package sort;

public class InsertSort {
    public static void swap(int[] arr, int m, int n) {
        if(m == n) return;
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

    public static void sort(int arr[]) {
        if(arr == null || arr.length < 2) return;
        for(int i = 1; i < arr.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                } else {
                    continue;
                }
            }
        }
    }
}
