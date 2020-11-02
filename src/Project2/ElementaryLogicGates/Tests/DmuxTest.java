package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Dmux;
import Project2.Tools.Out2;
import org.junit.Test;

import static org.junit.Assert.*;

public class DmuxTest {

    @Test
    public void compute() {
        Dmux dmux = new Dmux();

        Out2 out1 = dmux.calc(false,false);
        assertFalse(out1.a);
        assertFalse(out1.b);

        Out2 out2 = dmux.calc(true,false);
        assertTrue(out2.a);
        assertFalse(out2.b);

        Out2 out3 = dmux.calc(false,true);
        assertFalse(out3.a);
        assertFalse(out3.b);

        Out2 out4 = dmux.calc(true,true);
        assertFalse(out4.a);
        assertTrue(out4.b);
    }
}