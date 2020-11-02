package Project2.ElementaryLogicGates.Tests;

import Project2.ElementaryLogicGates.Dmux;
import org.junit.Test;

import static org.junit.Assert.*;

public class DmuxTest {

    @Test
    public void compute() {
        Dmux dmux1 = new Dmux();

        dmux1.calc(false,false);
        assertEquals(false,dmux1.a);
        assertEquals(false,dmux1.b);

        dmux1.calc(true,false);
        assertEquals(true,dmux1.a);
        assertEquals(false,dmux1.b);

        dmux1.calc(false,true);
        assertEquals(false,dmux1.a);
        assertEquals(false,dmux1.b);

        dmux1.calc(true,true);
        assertEquals(false,dmux1.a);
        assertEquals(true,dmux1.b);


    }
}