package sort;

public class HeapSort {
    public static void sort(int[] arr) {
        createBigRootHeap(arr);
        int heapSize = arr.length;
        while(heapSize > 0) {
            swap(arr, 0, heapSize-1);
            heapSize--;
            rootSink(arr, heapSize);
//            if(heapSize == 17 ) {
//                for (int i = 0; i < heapSize; i++) {
//                    System.out.println(arr[i]);
//                }
//                break;
//            }
        }
    }

    public static void swap(int[] arr, int m, int n) {
        if(m == n) return;
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

    public static void createBigRootHeap(int[] arr) {  //根据数组构建大根堆
        int heapSize = 1, index = 0;
        while(heapSize <= arr.length) {
            if(arr[index] > arr[(index - 1)/2]) {
                swap(arr, index, (index - 1)/2);
                index = (index - 1) >> 1;
            } else {
                heapSize ++;
                index = heapSize -1;
            }
        }
    }

    public static void rootSink(int[] arr, int heapSize) {  //将不符合要求的根节点下沉到合适位置
        int index = 0;
        while((index * 2 + 1) < heapSize) {
            if((index * 2 + 2) < heapSize) {
                if (arr[index] < arr[index * 2 + 1] || arr[index] < arr[index * 2 + 2]) {
                    int index2 = (arr[index * 2 + 1] < arr[index * 2 + 2]) ? (index * 2 + 2) : (index * 2 + 1);
                    swap(arr, index, index2);
                    index = index2;
                } else break;
            } else {
                if(arr[index] < arr[index * 2 + 1]) {
                    swap(arr, index, (index * 2 + 1));
                    index = index * 2 + 1;
                } else {
                    break;
                }
            }
        }
    }

//    public static void main(String[] args) {
//        int[] test = {10, -38, -26, -56, 65, 41, -76, 0, 9, -12, -57, -35, 0, 4, -4, 5, 5, -29, 86};
////        createBigRootHeap(test);
//        sort(test);
//        for(int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }
//    }
}
