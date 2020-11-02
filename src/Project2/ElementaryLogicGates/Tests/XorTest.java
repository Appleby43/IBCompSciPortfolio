package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Xor;
import org.junit.Test;

import static org.junit.Assert.*;

public class XorTest {

    @Test
    public void compute() {
        Xor xor = new Xor();

        assertTrue(xor.calc(true, false));
        assertTrue(xor.calc(false, true));
        assertFalse(xor.calc(false,false));
        assertFalse(xor.calc(true,true));
    }
}