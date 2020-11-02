package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Mux;
import org.junit.Test;

import static org.junit.Assert.*;

public class MuxTest {

    @Test
    public void compute() {
        Mux mux = new Mux();

        assertFalse(mux.calc(false, false, false));

        assertFalse(mux.calc(false, true, false));

        assertTrue(mux.calc(true,false,false));

        assertTrue(mux.calc(true, true, false));

        assertFalse(mux.calc(false, false, true));

        assertTrue(mux.calc(false,true,true));

        assertFalse(mux.calc(true, false, true));

        assertTrue(mux.calc(true, true, true));
    }
}