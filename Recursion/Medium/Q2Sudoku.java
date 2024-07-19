package Recursion.Medium;

public class Q2Sudoku {
    public static void print(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean sudoko(char arr[][], int row, int col) {
        if (row + 1 > arr.length) {
            print(arr);
            return true;
        }
        int nr = row;
        int nc = col + 1;
        if (col + 1 == 9) {
            nr = row + 1;
            nc = 0;
        }
        if (arr[row][col] != '.') {
            return sudoko(arr, nr, nc);
        }
        for (char i = 49; i <= 49 + 8; i++) {
            if (safe(arr, row, col, i)) {
                // char u=Character.forDigit(i,10);
                arr[row][col] = i;
                if (sudoko(arr, nr, nc)) {
                    return true;
                } else {
                    arr[row][col] = '.';
                }
            }
        }
        return false;
    }

    public static boolean safe(char arr[][], int r, int c, char d) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] == d) {
                return false;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[r][j] == d) {
                return false;
            }
        }
        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == d) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solveSudoku(char[][] board) {
        sudoko(board, 0, 0);
    }


    public static void main(String[] args) {
        char board[][]={{'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };
    sudoko(board, 0, 0);

}}
