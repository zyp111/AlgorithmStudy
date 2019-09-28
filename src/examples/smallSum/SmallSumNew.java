package examples.smallSum;

public class SmallSumNew {
    public static int smallSum(int[] arr) {
        if(arr == null || arr.length < 2) {
            return 0;
        }
        return mergeResult(arr, 0, arr.length - 1);
    }
    public static int mergeResult(int[] arr, int left, int right) {  //借用归并排序解决小和问题
        int smallSum = 0;
        if(left == right) {
            return 0;
        }
        int mid = left + ((right - left) >> 1);
        smallSum += mergeResult(arr, left, mid);
        smallSum += mergeResult(arr, mid + 1, right);
        smallSum += merge(arr, left, mid, right);
        return smallSum;
    }
    public static int merge(int[] arr, int left, int mid, int right) {
        int smallSum = 0;
        int[] storage = new int[right - left +1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= right) {
            if(arr[p1] < arr[p2]) {
                storage[i] = arr[p1];
                smallSum += arr[p1] * (right - p2 +1);
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
        return smallSum;
    }
}
