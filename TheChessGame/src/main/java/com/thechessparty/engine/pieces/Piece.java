package com.thechessparty.engine.pieces;

import com.thechessparty.engine.Team;
import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;

import java.util.List;

public abstract class Piece {

    // instance variables
    protected final int position;
    protected final Team team;

    //constructor
    Piece(final int position, final Team team){
        this.position = position;
        this.team = team;
    }

    public abstract List<Move> listLegalMoves(final GameBoard board);
}
