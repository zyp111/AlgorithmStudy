package _2019._10._07.rotatedSquareMatrix;

public class rotatedSquareMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
        rotate(arr);
        print(arr);
    }
    public static void rotate(int[][] arr) {
        int a = 0, b = 0;
        int m = arr[0].length - 1, n = arr.length - 1;
        while(m > a && n > b) {
            for(int i = 0; i < (m - a); i++) {
                int temp = arr[n - i][a];
                arr[n - i][a] = arr[n][m - i];
                arr[n][m - i] = arr[a+i][m];
                arr[a+i][m] = arr[b][a+i];
                arr[b][a+i] = temp;
            }
            a++;b++;m--;n--;
            print(arr);
        }
    }
    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
