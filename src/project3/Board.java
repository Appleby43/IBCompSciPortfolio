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

    public void claimCell(int i, int j, State state){
        cells[i][j].setState(state);
    }

    /**
     * Checks the board to see if someone's won.
     * @return The Cell State of the winner, X for X, O for O, and Empty if the board is not won
     */
    public State checkForVictor(){
        //check horizontal and vertical patterns
        for (int i = 0; i < cells.length; i++) {
            State previousState = null;
            for (int j = 0; j < cells.length; j++) {
                State currentState = cells[i][j].getState();
                if(currentState == State.EMPTY) break;
                if(previousState != null && currentState != previousState) break;

                //if this is the last cell in the pattern
                if (j == cells.length - 1){
                    return currentState;
                }
                previousState = currentState;
            }
        }

        for (int i = 0; i < cells.length; i++) {
            State previousState = null;
            for (int j = 0; j < cells.length; j++) {
                State currentState = cells[j][i].getState();
                if(currentState == State.EMPTY) break;
                if(previousState != null && currentState != previousState) break;

                //if this is the last cell in the pattern
                if (j == cells.length - 1){
                    return currentState;
                } else {
                    previousState = currentState;
                }
            }
        }

        return State.EMPTY;
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
