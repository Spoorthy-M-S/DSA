package DSA.Arrays.S2Medium;

class Q12RotateMatrix {
    public void bru(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int ans[][] = new int[n][m];
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                ans[j][n - i - 1] = arr[i][j];

            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                arr[j][i] = ans[j][i];
            }
        }
    }

    public static void optimal(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverse(arr[i]);
        }
    }

    public static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void rotate(int[][] matrix) {
        optimal(matrix);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("AFTER:");
        rotate(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}