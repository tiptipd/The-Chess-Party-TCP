package com.thechessparty.engine.pieces;

import com.thechessparty.engine.Team;
import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;

import java.util.List;

public abstract class Piece {

    // instance variables
    protected final PieceIdentifiers type;
    protected final int position;
    protected final Team team;

    //constructor
    Piece(final PieceIdentifiers type, final int position, final Team team){
        this.type = type;
        this.position = position;
        this.team = team;
    }

    public abstract List<Move> listLegalMoves(final GameBoard board);

    //--------------- getters and setters -------------------

    public PieceIdentifiers getType() {
        return type;
    }

    public Team getTeam(){
        return this.team;
    }

    public int getPosition() {
        return position;
    }
}
