package com.thechessparty.engine.board;

public class BoardUtilites {

    //class constants
    public static final boolean[] FIRST_COLUMN = initializeColumn(0);
    public static final boolean[] SECOND_COLUMN = initializeColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initializeColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initializeColumn(7);

    public static final boolean[] SECOND_ROW = initRow(1);
    public static final boolean[] SEVENTH_ROW = initRow(6);

    public static final int BOARD_DIMENSIONS = 64;
    public static final int ROW_DIMENSIONS = 8;

    private BoardUtilites() {
        throw new RuntimeException("Utility class not instantiatable");
    }

    public static boolean isValidMove(int coordinate) {
        return coordinate >= 0 && coordinate < 64;
    }

    /**
     * Takes in the column number and sets all of the cooresponding values in that column to false in the boolean array.
     * The array is an abstraction of a grid or board wherein, each 8 values corresponds to a new column i.e. 8x8 board.
     *
     * @param columnNum the column that is to be set to true
     * @return a boolean array of the board with the newly set true column
     */
    private static final boolean[] initializeColumn(int columnNum) {
        final boolean[] column = new boolean[BOARD_DIMENSIONS];
        do {
            column[columnNum] = true;
            columnNum += ROW_DIMENSIONS;
        } while (columnNum < BOARD_DIMENSIONS);
        return column;
    }
}
