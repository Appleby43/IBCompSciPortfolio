package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.And;
import org.junit.Test;

import static org.junit.Assert.*;

public class AndTest {

    @Test
    public void compute() {
        And and = new And();

        assertTrue(and.calc(true, true));

        assertFalse(and.calc(false, true));
        assertFalse(and.calc(true, false));
        assertFalse(and.calc(false, false));
    }
}
