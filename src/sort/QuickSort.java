package sort;

public class QuickSort {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if(arr == null || begin >= end)
            return;
        int num = arr[begin + (int)((end - begin) * Math.random())];
        int smaller = begin - 1;
        int bigger = end + 1;
        int nowIndex = begin;
        while(nowIndex < bigger) {
            if(arr[nowIndex] < num) {
                swap(arr, ++smaller, nowIndex++);
            } else if(arr[nowIndex] == num) {
                nowIndex++;
            } else {
                swap(arr, nowIndex, --bigger);
            }
        }
        quickSort(arr, begin, smaller);
        quickSort(arr, bigger, end);
    }

    public static void swap(int[] arr, int m, int n) {
        if(m == n) return;
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

//    public static void main(String[] args) { //随机例子简单测试
//        int[] test = {1,3,5,4,2,6,9,8,5,2};
//        sort(test);
//        for(int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }
//    }
}
