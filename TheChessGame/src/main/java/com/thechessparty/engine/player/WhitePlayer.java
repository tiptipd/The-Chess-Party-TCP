package com.thechessparty.engine.player;

import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;
import com.thechessparty.engine.pieces.Piece;

import java.util.List;

public class WhitePlayer extends Player{

    public WhitePlayer(GameBoard board, List<Move> whiteMoves, List<Move> blackMoves){
        super(board, whiteMoves, blackMoves);
    }

    @Override
    public List<Piece> getActivePieces() {
        return getBoard().getWhite();
    }

    //------------------- getters and setters --------------------
}
