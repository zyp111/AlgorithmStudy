package example.SmallSum;

public class SmallSumResult {
    public static int getSmallSum(int[] arr) {  //小和问题暴力解法，时间复杂度O(n^2)，用于对数器做为测试比较算法
        if(arr == null || arr.length < 2) {
            return 0;
        }
        int smallSum = 0;
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i])
                    smallSum += arr[j];
            }
        }
        return smallSum;
    }
//    public static void main(String[] args) {  //简单测试上面解法是否正确
//        int[] test = {1,3,4,2,5};
//        System.out.println(getSmallSum(test));
//    }
}
