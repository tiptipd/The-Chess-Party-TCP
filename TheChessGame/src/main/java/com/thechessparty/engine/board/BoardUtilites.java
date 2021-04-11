package com.thechessparty.engine.board;

public class BoardUtilites {

    public static final boolean[] FIRST_COLUMN = null;
    public static final boolean[] SECOND_COLUMN = null;
    public static final boolean[] SEVENTH_COLUMN = null;
    public static final boolean[] EIGHTH_COLUMN = null;

    private BoardUtilites(){
        throw new RuntimeException("Utility class not instantiatable");
    }

    public static boolean isValidMove(int coordinate) {
        return coordinate >= 0 && coordinate < 64;
    }
}
