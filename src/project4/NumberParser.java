package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class NumberParser extends Parser{
    public NumberParser(File file) throws FileNotFoundException {
        super(file);
    }

    public NumberParser(String resFilePath) throws FileNotFoundException {
        super(resFilePath);
    }

    public List<Double> getNumbers(){
        List<Double> retVal = new ArrayList<>();
        while (scanner.hasNext()){
            retVal.add(scanner.nextDouble());
        }

        return retVal;
    }
}
