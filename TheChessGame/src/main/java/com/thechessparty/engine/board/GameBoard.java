package com.thechessparty.engine.board;

public class GameBoard {

    //
    private final Tile[][] board;

    public GameBoard(){this(8);}
    public GameBoard(int dimensions){
        this.board = new Tile[dimensions][dimensions];
    }
}
