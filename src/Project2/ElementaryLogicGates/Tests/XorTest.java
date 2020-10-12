package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Xor;
import org.junit.Test;

import static org.junit.Assert.*;

public class XorTest {

    @Test
    public void compute() {
        Xor xor = new Xor();

        assertTrue(xor.compute(true, false));
        assertTrue(xor.compute(false, true));
        assertFalse(xor.compute(false,false));
        assertFalse(xor.compute(true,true));
    }
}