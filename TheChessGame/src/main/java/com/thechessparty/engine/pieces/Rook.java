package com.thechessparty.engine.pieces;

import com.thechessparty.engine.Team;
import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;

import java.util.List;

public class Rook extends Piece{

    public Rook(int position, final Team team){
        super(PieceIdentifiers.ROOK, position,team);
    }

    @Override
    public List<Move> listLegalMoves(GameBoard board) {
        return null;
    }

    @Override
    public String toString(){
        return PieceIdentifiers.ROOK.toString();
    }
}
