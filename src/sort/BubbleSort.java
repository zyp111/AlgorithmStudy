package sort;

public class BubbleSort {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(int[] arr, int m, int n) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
    public static void sort(int[] arr) {
        int i, j;
        for(i = arr.length - 1; i > 0 ; i--) {
            for(j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
//                    swap(arr[j], arr[j + 1]); //值传递，故而数组本身未曾改变
                    swap2(arr, j, j+1); //引用传递，方法中修改了数组的值会引起变化
                }
            }
        }
    }
}
