package com.thechessparty.engine.board;

import com.thechessparty.engine.pieces.Piece;

public final class NormalMove extends Move {


    //constructor
    public NormalMove(final GameBoard board, final Piece piece, final int destination) {
        super(board, piece, destination);
    }

}
