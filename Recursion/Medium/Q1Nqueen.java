package Recursion.Medium;
import java.util.*;
public class Q1Nqueen {
    static char board[][];
    public static void board(int n){
        board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
    }
    public static void nqueen(int row){
        if(row==board.length){
            System.out.println("*******************");
            print();
            System.out.println("*******************");
            return;
        }
        for(int i=0;i<board[0].length;i++){
        if(isSafe(i,row)){
                board[row][i]='Q';
                nqueen(row+1);
                board[row][i]='X';
            }
        }
    }
    public static void print(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int col,int row){
        //up
        //leftD
        //rightD
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;j--,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        board(n);
        nqueen(0);
    }
    
}
