package com.thechessparty.engine.player;

import com.thechessparty.engine.board.GameBoard;
import com.thechessparty.engine.board.Move;
import com.thechessparty.engine.pieces.King;
import com.thechessparty.engine.pieces.Piece;

import java.util.List;

public abstract class Player {

    // instance variables
    private final GameBoard board;
    private final King king;
    private final List<Move> legalMoves;

    // constructor
    public Player(final GameBoard board, final List<Move> playerMoves, List<Move> adversaryMoves) {
        this.board = board;
        this.king = kingify();
        this.legalMoves = playerMoves;
    }

    /**
     * Iterates through the immutable list of active pieces on the GameBoard to find the king
     *
     * @return the King Piece that is found
     */
    public King kingify() {
        for (final Piece p : getActivePieces()) {
            if (p.getType().isKing()) {
                return (King) p;
            }
        }
        throw new RuntimeException("Invalid GameBoard no King type found");
    }

    public abstract List<Piece> getActivePieces();

    //------------------- getters and setters --------------------


    public GameBoard getBoard() {
        return board;
    }

    public King getKing() {
        return king;
    }

    public List<Move> getLegalMoves() {
        return legalMoves;
    }
}
