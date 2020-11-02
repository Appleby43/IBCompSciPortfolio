package Project2.ElementaryLogicGates;

public class Xor {
    private Or or = new Or();
    private And and1 = new And(), and2 = new And();
    private Not not1 = new Not(), not2 = new Not();

    public boolean calc(boolean a, boolean b){
        return or.calc(and1.calc(not1.calc(a),b),
                and2.calc(a, not2.calc(b)));
    }
}
