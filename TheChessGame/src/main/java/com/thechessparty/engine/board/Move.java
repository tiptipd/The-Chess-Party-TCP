package com.thechessparty.engine.board;

import com.thechessparty.engine.pieces.Piece;

public abstract class Move {

    //instance constants
    final GameBoard board;
    final Piece movedPosition;
    final int destination;

    //constructor
    Move(final GameBoard board, final Piece piece, final int destination){
        this.board = board;
        this.movedPosition = piece;
        this.destination = destination;
    }
}
