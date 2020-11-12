package Project2.MultiBitVariants;


import Project2.ElementaryLogicGates.Or;

public class Or8Way {
    public boolean out;

    private Or[] ors = new Or[7];

    public Or8Way(){
        for (int i = 0; i < ors.length; i++) {
            ors[i] = new Or();
        }
    }

    public void compute(boolean[] in){
        boolean retval = in[0];

        for (boolean b : in) {
            for (int i = 0; i < ors.length; i++) {
                retval = ors[i].calc(retval, in[i + 1]);
            }
        }

        out = retval;
    }

}
