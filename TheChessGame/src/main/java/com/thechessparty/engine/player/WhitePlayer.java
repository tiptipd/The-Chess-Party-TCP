package com.thechessparty.engine.player;

import com.thechessparty.engine.Team;
import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;
import com.thechessparty.engine.pieces.Piece;

import java.util.List;

public class WhitePlayer extends Player{

    public WhitePlayer(GameBoard board, List<Move> whiteMoves, List<Move> blackMoves){
        super(board, whiteMoves, blackMoves);
    }

    //------------------- getters and setters --------------------

    @Override
    public List<Piece> getActivePieces() {
        return getBoard().getWhite();
    }

    @Override
    public Team getTeam() {
        return Team.WHITE;
    }

    @Override
    public Player getAdversary() {
        return getBoard().getBlackPlayer();
    }
}
