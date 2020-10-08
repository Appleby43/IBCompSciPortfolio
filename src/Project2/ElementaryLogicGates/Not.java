package Project2.ElementaryLogicGates;

public class Not {
    private Nand nand = new Nand();

    public boolean compute(boolean in){
        return nand.compute(in, in);
    }
}
