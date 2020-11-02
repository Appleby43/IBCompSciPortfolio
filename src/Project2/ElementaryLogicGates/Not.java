package Project2.ElementaryLogicGates;

public class Not {
    private Nand nand = new Nand();

    public boolean calc(boolean in){
        return nand.calc(in, in);
    }
}
