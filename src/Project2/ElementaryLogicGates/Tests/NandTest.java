package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Nand;
import org.junit.Test;

import static org.junit.Assert.*;

public class NandTest {

    @Test
    public void compute() {
        Nand nand = new Nand();

        assertTrue(nand.compute(false, false));
        assertTrue(nand.compute(true, false));
        assertTrue(nand.compute(false, true));
        assertFalse(nand.compute(true, true));
    }
}