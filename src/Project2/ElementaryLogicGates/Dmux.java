package Project2.ElementaryLogicGates;

import Project2.Tools.Out2;

public class Dmux {

    private Not not = new Not();
    private And and1 = new And(), and2 = new And();

    public Out2 calc(boolean in, boolean sel){
        boolean a = and1.calc(in, not.calc(sel));
        boolean b = and2.calc(in, sel);

        return new Out2(a, b);
    }
}
