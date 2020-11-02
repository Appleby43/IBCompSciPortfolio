package Project2.ElementaryLogicGates;

public class And {
    private Nand nand = new Nand();
    private Not not = new Not();

    public boolean calc(boolean a, boolean b){
        return not.calc(nand.calc(a,b));
    }
}
