package com.thechessparty.engine.board;

import com.thechessparty.engine.pieces.Piece;

public final class AttackMove extends Move{

    final Piece attackedPiece;

    // Constructor
    public AttackMove(final GameBoard board, final Piece piece, final int destination, final Piece attackedPiece) {
        super(board, piece, destination);
        this.attackedPiece = attackedPiece;
    }
}
