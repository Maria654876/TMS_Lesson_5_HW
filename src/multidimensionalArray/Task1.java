package multidimensionalArray;

import java.util.Arrays;

/**
 * Create a program for coloring a chessboard using a loop.
 */

public class Task1 {
    public static void main(String[] args) {
        String [][] chessBoard = new String[8][8];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
            System.out.println(Arrays.toString(chessBoard));
        }
    }
}
