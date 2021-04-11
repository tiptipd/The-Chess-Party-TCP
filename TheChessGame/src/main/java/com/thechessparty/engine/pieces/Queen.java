package com.thechessparty.engine.pieces;

import com.thechessparty.engine.Team;
import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;

import java.util.List;

public class Queen extends Piece{

    public Queen(int position, final Team team){
        super(position,team);
    }

    @Override
    public List<Move> listLegalMoves(GameBoard board) {
        return null;
    }
}
