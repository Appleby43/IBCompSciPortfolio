package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Or;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrTest {

    @Test
    public void compute() {
        Or or = new Or();

        assertFalse(or.compute(false, false));
        assertTrue(or.compute(true, false));
        assertTrue(or.compute(false, true));
        assertTrue(or.compute(true, false));
    }
}