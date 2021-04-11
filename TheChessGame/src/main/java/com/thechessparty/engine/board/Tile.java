package com.thechessparty.engine.board;

import com.thechessparty.engine.pieces.Piece;

public abstract class Tile {

    private int tileCoordinate;

    public Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

}//end Tile class
