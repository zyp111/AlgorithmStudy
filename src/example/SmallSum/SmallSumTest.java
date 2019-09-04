package example.SmallSum;

import java.util.Arrays;

public class SmallSumTest {
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

    public static int testMethod(int[] arr) { //用于进行结果比较的相对正确的方法
        return SmallSumResult.getSmallSum(arr);
    }
    public static void main(String[] args) {
        int compareTime = 5000000; //比较样本次数
        int size = 20;  //随机数组大小
        int value = 100;
        boolean result = true;
        for(int i = 0; i < compareTime; i++) {
            int[] arr = generateRandomArray(size, value);
            int[] arr1 = copyArray(arr);
            int smallSum = SmallSumNew.smallSum(arr);
            if(smallSum != testMethod(arr1)) result = false;
        }
        if(result) System.out.println("success");
        else System.out.println("false");
    }
}
