package project3;

import project3.Cell.State;

/**
 * A 'series' is a temporary association of cells. A win condition occurs if all three cells have the same state.
 */
public class Series {
    private final Cell[] cells;

    public Series(Cell c1, Cell c2, Cell c3) {
        cells = new Cell[]{c1, c2, c3};
    }

    public State checkVictor(){
        State previousState = null;
        for (int i = 0; i < cells.length; i++) {
            State currentState = cells[i].getState();
            if(currentState == State.EMPTY) break;
            if(previousState != null && currentState != previousState) break;

            //if this is the last cell in the pattern
            if (i == cells.length - 1){
                return currentState;
            } else {
                previousState = currentState;
            }
        }
        return State.EMPTY;
    }
}
