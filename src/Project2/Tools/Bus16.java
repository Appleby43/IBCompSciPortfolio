package Project2.Tools;

import java.util.Arrays;
import java.util.Objects;

public class Bus16 {
    private final boolean[] bus;

    /**
     * Some busses have to be constructed as they're used. They cannot be indexed until they are fully constructed.
     */
    private boolean constructed;
    private int constructionIndex = 0;

    /**
     * @param string string composed of only 0s and 1s that gets parsed into binary values
     */
    public Bus16(String string) {
        bus = BMath.stringToBooleanArray(string);

        if(bus.length != 16){
            throw new IllegalArgumentException("Didn't pass in a 16 bit input.");
        }
        constructed = true;
    }

    public Bus16(){
        bus = new boolean[16];

        constructed = false;
    }

    public void build(boolean a){
        if(constructed) throw new UnsupportedOperationException("Tried to add to a complete 16 bit bus");

        bus[constructionIndex] = a;

        if(constructionIndex >= 15){
            constructed = true;
        } else constructionIndex++;
    }

    public boolean get(int i){

        if(!constructed){
            throw new UnsupportedOperationException("Tried to use a 16 bit bus before it was fully constructed");
        }

        return bus[i];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus16 bus16 = (Bus16) o;
        return constructed == bus16.constructed &&
                Arrays.equals(bus, bus16.bus);
    }

}
