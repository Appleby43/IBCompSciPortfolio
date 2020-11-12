package Project2.MultiBitVariants.Tests;

import Project2.MultiBitVariants.And16;
import Project2.Tools.BMath;
import Project2.Tools.Bus16;
import org.junit.Test;

import static org.junit.Assert.*;

public class And16GateTest {

    @Test
    public void compute() {
        And16 and16 = new And16();

        Bus16 a = new Bus16("1111111111111111");
        Bus16 b = new Bus16("0000111111111111");
        Bus16 out = and16.compute(a,b);
        Bus16 expected = new Bus16("0000111111111111");
        assertEquals(expected, out);
    }
}