package view;

import model.Board;


public class GameMain {

        private static Board myBoard;
        private static GameBoard myGameBoard;

    public static void main(String[] args) {
        myBoard = new Board();
        System.out.println(myBoard);

        myGameBoard = new GameBoard();
        myGameBoard.start();
    }

}
