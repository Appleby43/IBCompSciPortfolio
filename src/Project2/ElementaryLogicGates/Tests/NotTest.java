package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Not;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotTest {


    @Test
    public void compute() {
        Not not = new Not();

        assertTrue(not.compute(false));
        assertFalse(not.compute(true));
    }
}