package Project2.ElementaryLogicGates;

public class And {
    private Nand nand = new Nand();
    private Not not = new Not();

    public boolean compute(boolean a, boolean b){
        return not.compute(nand.compute(a,b));
    }
}
