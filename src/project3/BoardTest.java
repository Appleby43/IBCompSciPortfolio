package project3;

import Project2.ElementaryLogicGates.Dmux;
import Project2.Tools.Out2;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testVerticalVictor() {
        Board b = new Board();
        b.claimCell(0,0, Cell.State.O);
        b.claimCell(1,0, Cell.State.O);
        b.claimCell(2,0, Cell.State.O);

        assertEquals(b.checkForVictor(), Cell.State.O);
    }

    @Test
    public void testHorizontalVictor() {
        Board b = new Board();
        b.claimCell(2,0, Cell.State.X);
        b.claimCell(2,1, Cell.State.X);
        b.claimCell(2,2, Cell.State.X);

        assertEquals(b.checkForVictor(), Cell.State.X);
    }

    @Test
    public void testNoVictor() {
        Board b = new Board();
        assertEquals(b.checkForVictor(), Cell.State.EMPTY);
    }

    @Test
    public void testPrint() {
       Board b = new Board();

       b.claimCell(0,0, Cell.State.X);
       b.claimCell(1,0, Cell.State.O);

       b.printBoard();
    }
}