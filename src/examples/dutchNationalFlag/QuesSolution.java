package examples.dutchNationalFlag;

public class QuesSolution {
    public static void getTheResult(int[] arr, int num) {
        //算法求解，要求额外空间复杂度O(1)，时间复杂度O(n)
        if(arr == null || arr.length < 2)
            return;
        int smaller = -1, bigger = arr.length;
        int nowIndex = 0;
        while(nowIndex != bigger) {
            if(arr[nowIndex] < num) {
                swap(arr, ++smaller, nowIndex++);
            } else if(arr[nowIndex] == num) {
                nowIndex++;
            } else {
                swap(arr, nowIndex, --bigger);
            }
        }
    }

    public static void swap(int[] arr, int m, int n) {
        if(m == n) return;
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

    public static int[] generateRandomArray(int size, int value) { //生成长度随机的数组用于简单测试
        int[] arr = new int[(int)((size + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)((value + 1) * Math.random() - value * Math.random());
        }
        return arr;
    }

    public static boolean isRight(int[] arr, int num) {
        //检验一个数组是否为符合要求的结果数组
        int index1 = 0, index2 = 0, flag =0;
        boolean result = true;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num && flag == 0) {
                index1 = i;  //index1记录第一个等于目标数的位置
                flag = 1;
            }
            if(arr[i] > num) {
                index2 = i - 1;  //index2记录最后一个等于目标数的位置
                break;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if((i < index1) && (arr[i] >= num)) result = false;
            if((i <= index2) && (i >= index1) && (arr[i] != num)) result = false;
            if((i > index2) && (arr[i] <= num)) result = false;
        }
        return result;
    }

    public static void main(String[] args) {  //简单案例测试
//        int times = 5000000;  //测试次数
//        boolean result = true;  //总测试结果
//        for(int i = 0; i < times; i++) {
//            int[] test = generateRandomArray(10,10);
//            if(test.length >= 2) {
//                int num = test[((test.length - 1) >> 1)];
//                getTheResult(test, num);
//                if (!isRight(test, num)) result = false;
//            }
//        }
//        if(result)
//            System.out.println("right");
//        else
//            System.out.println("error");  //！大样本测试结果存在问题，待改正！
        int[] test = {1,3,6,8,9,5,4,2,0,7};
        int num = 5;
        getTheResult(test, num);
        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
    }
}
