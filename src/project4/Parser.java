package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    public Scanner scanner;

    public Parser(File file) throws FileNotFoundException {
       scanner = new Scanner(file);


    }

    public void printData(){
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
