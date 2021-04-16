package com.thechessparty.engine;

import com.thechessparty.engine.board.GameBoard;

public class Driver {

    public static void main(String[] args) {
        GameBoard board = GameBoard.createInitialBoard();
        System.out.println(board);
    }
}
