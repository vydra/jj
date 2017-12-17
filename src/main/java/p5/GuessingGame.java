package p5;

import javax.swing.JOptionPane;

public class GuessingGame {
    public static void main(String[] args) {

        String rowString = JOptionPane.showInputDialog("How many Rows");
        String colString = JOptionPane.showInputDialog("How many Columns");
        int row = Integer.parseInt(rowString);
        int col = Integer.parseInt(colString);

        int[][] gameBoard = new int[row][col]; //at this point all elements are 0
        //fill board with random #'s
        for(int r = 0; r < gameBoard.length;r++)
        {
            for(int c = 0; c < gameBoard[r].length; c++ ) {
               gameBoard[r][c] = (int) (Math.random() * 99) + 1;

            }

        }
        //place ZERO at random position
        int zeroRow = (int) (Math.random() * row);
        int zeroColumn = (int) (Math.random() * col);
        gameBoard[zeroRow][zeroColumn] = 0;

        //print board
        for(int r = 0; r<gameBoard.length;r++)
        {
            for(int c = 0; c<gameBoard[r].length; c++ ) {
                System.out.print("x");

            }
            System.out.println("");

        }

        // ask user to guess row and column
        int limit = 5;
        while(limit > 0) {
            limit--;
            String guessRowString = JOptionPane.showInputDialog("Guess row of 0");
            String guessColString = JOptionPane.showInputDialog("Guess col of 0");
            int guessRow = Integer.parseInt(guessRowString);
            int guessCol = Integer.parseInt(guessColString);
            if (gameBoard[guessRow][guessCol] == 0) {
                System.out.println("BAM! You found number 0");
                return;
            } else {
                System.out.println("off by row: " + (zeroRow - guessRow) + " of by col: " + (zeroColumn - guessCol));
            }
        }

    }
}
