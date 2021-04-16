package com.thechessparty.engine.player;

import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;
import com.thechessparty.engine.pieces.Piece;

import java.util.List;

public class BlackPlayer extends Player{

    // constructor
    public BlackPlayer(GameBoard board, List<Move> whiteMoves, List<Move> blackMoves){
        super(board, blackMoves, whiteMoves);
    }

    //------------ public methods -----------------

    @Override
    public List<Piece> getActivePieces() {
        return getBoard().getBlack();
    }
}
