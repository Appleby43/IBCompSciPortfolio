package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Or;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrTest {

    @Test
    public void compute() {
        Or or = new Or();

        assertFalse(or.calc(false, false));
        assertTrue(or.calc(true, false));
        assertTrue(or.calc(false, true));
        assertTrue(or.calc(true, false));
    }
}