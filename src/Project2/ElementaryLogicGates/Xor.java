package Project2.ElementaryLogicGates;

public class Xor {
    private Or or = new Or();
    private And and1 = new And(), and2 = new And();
    private Not not1 = new Not(), not2 = new Not();

    public boolean compute(boolean a, boolean b){
        return or.compute(and1.compute(not1.compute(a),b),
                and2.compute(a, not2.compute(b)));
    }
}
