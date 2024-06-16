package DSA.Arrays.S2Medium;

class Q11SetMAtrixZero {
    public static void br(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    markrow(ans, i, j);
                    markcol(ans, i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = ans[i][j];
            }
        }
    }

    public static void markrow(int arr[][], int row, int col) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i][col] = 0;
        }
    }

    public static void better(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int row[] = new int[n];
        int col[] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void markcol(int arr[][], int row, int col) {
        int m = arr[0].length;
        for (int i = 0; i < m; i++) {
            arr[row][i] = 0;
        }
    }

    public static void optimal(int arr[][]) {
        int col = 1;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j != 0 && arr[i][j] == 0) {
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
                if (j == 0 && arr[i][j] == 0) {
                    col = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        if (arr[0][0] == 0) {
            for (int i = 0; i < m; i++) {
                arr[0][i] = 0;
            }
        }
        if (col == 0) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void setZeroes(int[][] matrix) {
        optimal(matrix);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("AFTER:");
        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}