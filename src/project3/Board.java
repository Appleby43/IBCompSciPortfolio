package project3;

import project3.Cell.State;

/**
 * The board is where the game happens.
 */
public class Board {
    private Cell[][] cells = new Cell[3][3];

    public Board() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void claimCell(int i, int j, State state) throws CellOccupiedException{
        cells[i][j].setState(state);
    }

    /**
     * Checks the board to see if someone's won.
     * @return The Cell State of the winner, X for X, O for O, and Empty if the board is not won
     */
    public State checkForVictor(){
        //check horizontal and vertical patterns
        for (int i = 0; i < cells.length; i++) {
            Series series = new Series(cells[i][0], cells[i][1], cells[i][2]);

            State victor = series.checkVictor();
            if (!victor.equals(State.EMPTY)) return victor;
        }

        for (int i = 0; i < cells.length; i++) {
            Series series = new Series(cells[0][i], cells[1][i], cells[2][i]);

            State victor = series.checkVictor();
            if (!victor.equals(State.EMPTY)) return victor;
        }

        //check diagonals
        Series diag1 = new Series(cells[0][0], cells[1][1], cells[2][2]);

        State victor1 = diag1.checkVictor();
        if (!victor1.equals(State.EMPTY)) return victor1;

        Series diag2 = new Series(cells[0][2], cells[1][1], cells[2][0]);

        State victor2 = diag2.checkVictor();
        if (!victor2.equals(State.EMPTY)) return victor2;

        return State.EMPTY;
    }

    /**
     * @return whether or not the board can be played on
     */
    public boolean isPlayable(){
        for (Cell[] arr : cells) {
            for (Cell c : arr) {
                if (c.getState().equals(State.EMPTY)) return true;
            }
        }
        return false;
    }
    public void printBoard(){
        System.out.println("  0   1   2 ");
        String line1 = String.format("0 %1$c | %2$c | %3$s", cells[0][0].getState().value, cells[0][1].getState().value, cells[0][2].getState().value);
        System.out.println(line1);
        System.out.println(" -----------");
        String line2 = String.format("1 %1$c | %2$c | %3$s", cells[1][0].getState().value, cells[1][1].getState().value, cells[1][2].getState().value);
        System.out.println(line2);
        System.out.println(" -----------");
        String line3 = String.format("2 %1$c | %2$c | %3$s", cells[2][0].getState().value, cells[2][1].getState().value, cells[2][2].getState().value);
        System.out.println(line3);
    }
}
