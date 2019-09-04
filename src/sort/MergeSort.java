package sort;

public class MergeSort {
    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2)
            return;
        mergeSort(arr, 0, arr.length -1);
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if(right == left) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] storage = new int[right - left +1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= right) {
            if(arr[p1] < arr[p2]) {
                storage[i] = arr[p1];
                i++;
                p1++;
            } else {
                storage[i] = arr[p2];
                i++;
                p2++;
            }
        }
        while(p1 <= mid) {
            storage[i] = arr[p1];
            i++;
            p1++;
        }
        while(p2 <= right) {
            storage[i] = arr[p2];
            i++;
            p2++;
        }
        for(i = 0; i < storage.length; i++) {
            arr[left + i] = storage[i];
        }
    }
}
