package com.thechessparty.engine.pieces;

import com.thechessparty.engine.Team;
import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;

import java.util.List;

public class Knight extends Piece{

    public Knight(int position, final Team team){
        super(position, team);
    }

    @Override
    public List<Move> listLegalMoves(GameBoard board) {
        return null;
    }
}
