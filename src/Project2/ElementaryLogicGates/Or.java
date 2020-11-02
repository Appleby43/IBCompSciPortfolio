package Project2.ElementaryLogicGates;

public class Or {
    private Nand nand = new Nand();
    private Not not1 = new Not(), not2 = new Not();

    public boolean calc(boolean a, boolean b){
        return nand.calc(not1.calc(a), not2.calc(b));
    }

}
