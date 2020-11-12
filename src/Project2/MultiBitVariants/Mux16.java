package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.Mux;

public class Mux16 {
    public boolean[] out = new boolean[16];

    private Mux[] muxes = new Mux[16];

    public Mux16() {
        for (int i = 0; i < muxes.length; i++) {
            muxes[i] = new Mux();
        }
    }

    public void compute(boolean[] a,boolean[] b,boolean[] sel){
        for (int i = 0; i < muxes.length; i++) {
            Mux mux = muxes[i];
            out[i] = mux.calc(a[i], b[i], sel[i]);
        }
    }
}

