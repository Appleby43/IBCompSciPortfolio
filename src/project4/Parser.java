package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    protected Scanner scanner;

    public Parser(File file) throws FileNotFoundException {
       scanner = new Scanner(file);
    }

    public Parser(String resFilePath) throws FileNotFoundException {
        this(new File(Parser.class.getResource(resFilePath).getFile()));
    }

    public void printData(){
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }

    public String getData(){
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()){
            sb.append(scanner.next() + "\n");
        }
        return sb.toString();
    }
}
