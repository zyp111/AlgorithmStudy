package forOffer.ex1;

public class Ex3 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void findRepeat(int[] arr) {
        boolean flag = false;
        int index = 0;
        while(!flag) {
            if(arr[index] == index)
                index ++;
            else {
                if(arr[arr[index]] == arr[index]) {
                    System.out.println(arr[index]);
                    flag = true;
                } else
                    swap(arr, index, arr[index]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,0,2,5,3};
        findRepeat(arr);
    }
}
