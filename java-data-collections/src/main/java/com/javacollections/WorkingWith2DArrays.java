package com.javacollections;
import java.util.*;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] boardOne = new char[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                boardOne[i][j] = '-';
            }
        }
        System.out.println("\n2D Array: ");
        System.out.println("\nBoard One: ");
        System.out.println(Arrays.deepToString(boardOne));

        boardOne[0][0] = 'X';
        boardOne[1][1] = 'X';
        boardOne[2][2] = 'X';

        System.out.println(Arrays.deepToString(boardOne));

        char[][] boardTwo = new char[][]{
            new char[]{'O', 'O', 'O'},
            new char[]{'O', 'O', 'O'},
            new char[]{'O', 'O', 'O'}
        };

        System.out.println("\nBoard Two: ");
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
