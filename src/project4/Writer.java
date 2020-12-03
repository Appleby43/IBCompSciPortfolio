package project4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Writes a file to the resources directory.
 */
public class Writer {
    private FileWriter fileWriter;
    //get the res dir
    public static final String outLocation = new File(Writer.class.getResource("beemovie.txt").getFile()).getParent();

    public Writer (String fileName) throws IOException {
        fileWriter = new FileWriter(outLocation + '/' + fileName);
    }

    public void writeData(String data) throws IOException{
        fileWriter.write(data);
        fileWriter.close();
    }
}
