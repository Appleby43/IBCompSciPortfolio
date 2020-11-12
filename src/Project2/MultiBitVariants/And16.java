package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.And;
import Project2.Tools.Bus16;

public class And16 {

    private And[] ands = new And[16];

    public And16() {
        for (int i = 0; i < ands.length; i++) {
            ands[i] = new And();
        }
    }

    public Bus16 compute(Bus16 a, Bus16 b){
        Bus16 retVal = new Bus16();

        int i = 0;
        for (And and : ands) {
            retVal.build(and.calc(a.get(i), b.get(i)));
            i++;
        }
        return retVal;
    }
}
