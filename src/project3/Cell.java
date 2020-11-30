package project3;

/**
 * A cell is one spot on a board that can be empty or filled with X or O
 */
public class Cell {
    private State state = State.EMPTY;

    public enum State {
        EMPTY(' '),
        X('X'),
        O('O');

        State(char value) {
            this.value = value;
        }

        public final char value;
    }

    public void setState(State newState) throws CellOccupiedException{
        if(state != State.EMPTY) throw new CellOccupiedException();
        assert newState != State.EMPTY;

        state = newState;
    }

    public State getState(){
        return state;
    }
}
