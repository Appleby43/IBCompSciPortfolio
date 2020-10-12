package Project2.ElementaryLogicGates;

public class Or {
    private Nand nand = new Nand();
    private Not not1 = new Not(), not2 = new Not();

    public boolean compute(boolean a, boolean b){
        return nand.compute(not1.compute(a), not2.compute(b));
    }

}
