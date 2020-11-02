package Project2.ElementaryLogicGates;

public class Mux {
    private Or or = new Or();
    private And and1 = new And(), and2 = new And();
    private Not not = new Not();

    public boolean calc(boolean a, boolean b, boolean sel){
        boolean t1 = and1.calc(a, not.calc(sel));
        boolean t2 = and2.calc(b, sel);
        return or.calc(t1, t2);
    }
}
