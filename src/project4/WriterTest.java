package project4;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class WriterTest {

    @Test
    public void testWrite() {
        try {
            Parser parser = new Parser(new File(getClass().getResource("/project4/beemovie.txt").getFile()));
            String data = parser.getData();
            Writer writer = new Writer("beecopy.txt");

            writer.writeData(data);
        } catch (IOException e) {
            fail();
        }
    }

    @Test
   public void testPath(){
       System.out.println(Writer.outLocation);
   }

}