package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Nand;
import org.junit.Test;

import static org.junit.Assert.*;

public class NandTest {

    @Test
    public void compute() {
        Nand nand = new Nand();

        assertTrue(nand.calc(false, false));
        assertTrue(nand.calc(true, false));
        assertTrue(nand.calc(false, true));
        assertFalse(nand.calc(true, true));
    }
}