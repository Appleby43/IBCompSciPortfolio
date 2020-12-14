package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        NumberParser numberParser = new NumberParser("/project4/nums.txt");

    }

    public static double avg(List<Double> nums){
    	double sum = 0.0;
        for (Double num : nums) {
            sum += num;
        }

        return sum / nums.size();
    }
}
