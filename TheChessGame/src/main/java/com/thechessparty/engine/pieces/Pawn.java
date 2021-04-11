package com.thechessparty.engine.pieces;

import com.thechessparty.engine.Team;
import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;

import java.util.List;

public class Pawn extends Piece{

    public Pawn(int position, final Team team){
        super(position, team);
    }

    @Override
    public List<Move> listLegalMoves(GameBoard board) {
        return null;
    }
}
