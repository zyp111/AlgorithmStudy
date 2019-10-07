package _2019._10._07.printMatrixInCircle;

public class PintMartrixInCircle {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
    }
    public static void print(int[][] arr) {
        int a = 0, b = 0;
        int n = arr.length - 1, m= arr[0].length - 1;
        while(m > a && n > b) {
            for(int i = a; i < m;i++)
                System.out.println(arr[b][i]);
            for(int j = b;j < n;j++)
                System.out.println(arr[j][m]);
            for(int k = m; k > a; k--)
                System.out.println(arr[n][k]);
            for(int l = n; l > b; l--)
                System.out.println(arr[l][a]);
            a++;b++;m--;n--;
        }
        if(n==b) {
            for(int i = a;i < m;i++)
                System.out.println(arr[b][i]);
        }
        if(m == a) {
            for(int i = b; i < n; i++)
                System.out.println(arr[i][a]);
        }
    }
}
