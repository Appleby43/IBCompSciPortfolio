package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.And;
import org.junit.Test;

import static org.junit.Assert.*;

public class AndTest {

    @Test
    public void compute() {
        And and = new And();

        assertTrue(and.compute(true, true));

        assertFalse(and.compute(false, true));
        assertFalse(and.compute(true, false));
        assertFalse(and.compute(false, false));
    }
}
