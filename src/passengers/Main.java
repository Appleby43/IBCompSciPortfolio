package passengers;

import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(Collection<Integer> passengers) {
        int[] p_array = new int[passengers.size()];

        Iterator<Integer> iterator = passengers.iterator();

        int count = 0;
        while (iterator.hasNext()){
            p_array[count] = iterator.next();
            count++;
        }

        //sum up all weeks into an array
        int[] dailySums = new int[7];
        for (int i = 0; i < p_array.length; i++) {
            int weekday = i % 7;

            dailySums[weekday] += p_array[i];
        }

        int[] dailyAvgs = new int[7];

        //divide the sums by the number of weeks. If there are extra days in partial weeks, properly handle them.
        int numFullWeeks = p_array.length / 7;
        int numExtraDays = p_array.length % 7;

        for (int i = 0; i < dailyAvgs.length; i++) {
            if(numExtraDays < i){
                dailyAvgs[i] = dailySums[i] / numFullWeeks;
            } else {
                dailyAvgs[i] = dailySums[i] / (numFullWeeks + 1);
            }
        }

        //find the index of the largest number
        int largestDay = 0;

        for (int i = 1; i < dailyAvgs.length; i++){
            if(dailyAvgs[largestDay] < dailyAvgs[i]){
                largestDay = i;
            }
        }


    }

    private static String convert(int day){
        switch (day){
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return "thats not a weekday";
        }
    }
}
