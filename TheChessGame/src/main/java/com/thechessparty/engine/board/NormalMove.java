package com.thechessparty.engine.board;

import com.thechessparty.engine.pieces.Piece;

public final class NormalMove extends Move {

    //constructor
    public NormalMove(final GameBoard board, final Piece piece, final int destination) {
        super(board, piece, destination);
    }

    //-------------- public methods ------------------

    /**
     * Utilizes the GameBoard Builder class to construct a new board by placing all of the current players pieces
     * into position if they have not moved then all of the adversary's pieces by setting the values through the
     * builder. The moved piece is then set and finally set the next player to the adversary
     *
     * @return a new GameBoard constructed through the builder
     */
    @Override
    public GameBoard execute() {

        //creates a Builder for constructing a new board
        final GameBoard.Builder builder = new GameBoard.Builder();

        // place all of the current players unmoved pieces into position
        for (final Piece p : this.board.getCurrentPlayer().getActivePieces()) {
            if (!this.movedPosition.equals(p)) {
                builder.setPiece(p);
            }
        }

        //place all of the adversary's pieces into position
        for (final Piece p : this.board.getCurrentPlayer().getAdversary().getActivePieces()) {
            builder.setPiece(p);
        }

        // sets the moved Piece
        builder.setPiece(null);

        //sets the boards current player to the next player
        builder.setNextMove(this.board.getCurrentPlayer().getAdversary().getTeam());

        return builder.build();
    }

    @Override
    public String toString() {
        return "-";
    }

}
