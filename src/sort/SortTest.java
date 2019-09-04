package sort;

import sort.MergeSort;

import java.util.Arrays;

public class SortTest {
    public static int[] generateRandomArray(int size, int value) { //生成长度随机的数组
        int[] arr = new int[(int)((size + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)((value + 1) * Math.random() - value * Math.random());
        }
        return arr;
    }
    public static int[] copyArray(int[] arr) {  //复制数组
        if(arr == null)  {
            return null;
        }
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
    public static boolean isEqual(int[] arr1, int[] arr2) {  //比较两数组是否完全一致
        if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) return false;
        else if(arr1 == null && arr2 == null) return true;
        else if(arr1.length != arr2.length) return false;
        else {
            for(int i = 0; i < arr1.length; i ++) {
                if(arr1[i] != arr2[i]) return false;
            }
            return true;
        }
    }
    public static void testMethod(int[] arr) { //用于进行结果比较的相对正确的方法
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int compareTime = 5000000; //比较样本次数
        int size = 20;  //随机数组大小
        int value = 100;
        boolean result = true;
        for(int i = 0; i < compareTime; i++) {
            int[] arr = generateRandomArray(size, value);
            int[] arr1 = copyArray(arr);
//            BubbleSort.sort(arr); //测试冒泡排序
//            SelectionSort.sort(arr); //测试选择排序
//            InsertSort.sort(arr); //测试插入排序
//            MergeSort.sort(arr); //测试归并排序
            testMethod(arr1);
            if(!isEqual(arr, arr1)) result = false;
        }
        if(result) System.out.println("success");
        else System.out.println("false");
    }
}
