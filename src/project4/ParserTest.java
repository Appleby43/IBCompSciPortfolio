package project4;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ParserTest {
    public void testRead(){
        File beeMovieScript = new File(Main.class.getResource("/project4/beemovie.txt").getFile());

        try {
            Parser parser = new Parser(beeMovieScript);
            parser.printData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}