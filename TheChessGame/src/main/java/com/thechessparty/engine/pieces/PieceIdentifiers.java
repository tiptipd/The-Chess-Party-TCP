package com.thechessparty.engine.pieces;

public enum PieceIdentifiers {

    PAWN("P"),
    ROOK("R"),
    KNIGHT("N"),
    BISHOP("B"),
    QUEEN("Q"),
    KING("K");

    private String pieceName;

    PieceIdentifiers(final String name){
        this.pieceName = name;
    }

    @Override
    public String toString(){
        return this.pieceName;
    }

}
